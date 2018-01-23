package com.mysupermarket.gooddata.dao;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysupermarket.mapper.GoodDetailMapper;
import com.mysupermarket.pojo.GoodDetailLoadEntity;

@Repository
public class GoodDetailDao {
	
	private Log logger = LogFactory.getLog(getClass());
	@Autowired
	private GoodDetailMapper goodDetailMapper;
	
	public List<GoodDetailLoadEntity> GetGoodDetail(int goodid){
		List<GoodDetailLoadEntity> list = goodDetailMapper.SelectByGoodId(goodid);
		if(list.size() > 0){
			for(GoodDetailLoadEntity list_item : list){
				logger.info("获取的gd_url : " + list_item.getGdUrl());
				logger.info("获取到的g_price : " + list_item.getGdGood().getgPrice());
				logger.info("获取到的sp_name : " + list_item.getGdShop().getSpName());
				logger.info("获取到的评论�? : " + list_item.getGdEvaluate().get(0).getGdlContent());
			}
			return list;
		}
		return null;
	}
	
}
