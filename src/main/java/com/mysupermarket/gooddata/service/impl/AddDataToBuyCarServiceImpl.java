package com.mysupermarket.gooddata.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mysupermarket.gooddata.controller.ao.DataToAddToBuyCarEntity;
import com.mysupermarket.gooddata.service.AddDataToBuyCarService;
import com.mysupermarket.mapper.BuyCarMapper;
import com.mysupermarket.mapper.GoodBuycarMapper;
import com.mysupermarket.pojo.BuyCar;
import com.mysupermarket.pojo.GoodBuycar;
import com.mysupermarket.pojo.GoodBuycarKey;

@Service("addDataToBuyCarService")
public class AddDataToBuyCarServiceImpl implements AddDataToBuyCarService{

	private Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	private GoodBuycarMapper goodBuycarMapper;
	@Autowired
	private BuyCarMapper buyCarMapper;
	
	@Transactional
	@Override
	public Map<String, String> PostDataToBuyCar(DataToAddToBuyCarEntity data, int useraccount) {
		// TODO Auto-generated method stub
		//先对商品选择字符串做处理
		String goodChoose = null;
		goodChoose = data.getGoodChoose().substring(1);
		logger.info("商品选择为 : " + goodChoose);
		data.setGoodChoose(goodChoose);
		
		//1.检出账号相关的buy_car记录, 获得buycarId
		List<BuyCar> l = buyCarMapper.selectByUseraccount(useraccount);
		//TODO : 获取到buycarId
		int buycarId = -1;
		if(l == null){//TODO : 暂时没有购物车, 添加购物车记录//TODO : 暂时没有购物车, 添加购物车记录
			BuyCar b = new BuyCar();
			int lastBcid = -1;
			lastBcid = buyCarMapper.selectLastId();
			b.setBcId(lastBcid + 1);
			b.setBcUseraccount(useraccount);
			buyCarMapper.insert(b);
			buycarId = lastBcid + 1;
		}else{
			buycarId = l.get(0).getBcId();
		}
		
		//2.检出是否已存在在该商品在购物中
		GoodBuycar  gbc = null;
		gbc = CheckISExist(data.getGoodId(), buycarId, data.getGoodChoose());
		//3.如果存在规格是否一样, 一样则添加数量
		if(gbc != null){
			gbc.setGbcGoodnum(gbc.getGbcGoodnum() + data.getGoodNum());
			goodBuycarMapper.updateByPrimaryKey(gbc);
		}
		//4.如果不存在则添加新的购物车记录
		else{
			gbc = new GoodBuycar();
			gbc.setGbcBuycar(buycarId);
			gbc.setGbcGood(data.getGoodId());
			gbc.setGbcGoodchoose(data.getGoodChoose());
			gbc.setGbcGoodnum(data.getGoodNum());
			goodBuycarMapper.insert(gbc);
		}
		
		Map<String, String> resultMap = new HashMap<String, String>(1);
		resultMap.put("status", "finished");
		return resultMap;
	}
	
	@Override
	public GoodBuycar CheckISExist(int goodId, int buycarId, String goodChoose) {
		// TODO Auto-generated method stub
		
		GoodBuycarKey key = new GoodBuycarKey();
		key.setGbcGood(goodId);
		key.setGbcBuycar(buycarId);
		key.setGbcGoodchoose(goodChoose);
		
		return goodBuycarMapper.selectByPrimaryKey(key);
	}
	
}
