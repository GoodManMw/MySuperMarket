package com.mysupermarket.gooddata.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.LinkedMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mysupermarket.gooddata.service.LoadBuyCarGoodDataService;
import com.mysupermarket.mapper.GoodBuycarMapper;
import com.mysupermarket.pojo.BuyCarGoodDataLoadEntity;

@Service("loadBuyCarGoodDataService")
public class LoadBuyCarGoodDataServiceImpl implements LoadBuyCarGoodDataService{
	
	private Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	GoodBuycarMapper goodBuycarMapper;
	
	@Transactional
	@Override
	public List<Map<String, Object>> LoadBuyCarData(int username) {
		// TODO Auto-generated method stub
		
		List<Map<String, Object>> result = new LinkedList<Map<String, Object>>();
//		result.add(new Map<String, String>().put("", value))
		
		List<BuyCarGoodDataLoadEntity> l = goodBuycarMapper.selectBuyCarGoodData(username);
		if( l != null){
			logger.info("获取到的一条购物车数据为 : goodChoose = " + l.get(0).getGoodChoose() + " goodNum = " + l.get(0).getGoodNum() + " goodUrl = " + l.get(0).getgUrl().split(";")[0]);
			for(BuyCarGoodDataLoadEntity bL : l){
				Map<String, Object> m = new LinkedMap();
				m.put("photo_url", bL.getgUrl().split(";")[0]);
				int nameLength = bL.getgName().length() < 16 ? bL.getgName().length() : 16;
				m.put("description", bL.getgName().substring(0, nameLength));
				m.put("good_choose", bL.getGoodChoose());
				m.put("good_num", bL.getGoodNum());
				m.put("good_price", bL.getgPrice());
				result.add(m);
			}
		}
		
		return result;
	}
	
}
