package com.mysupermarket.gooddata.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysupermarket.gooddata.service.LoadBuyCarGoodDataService;

@Controller
@Scope("prototype")
public class BuyCarGoodData {

	private Log logger  = LogFactory.getLog(getClass()) ;
	
	@Autowired
	private LoadBuyCarGoodDataService loadBuyCarGoodDataService;
	
	@RequestMapping("buyCarGoodData")
	public @ResponseBody List buyCarData(HttpServletRequest req){
		
		logger.info("进来LoadBuyCarGoodData");
		
		HttpSession session = req.getSession();
		int username = 0;
		username = (int)session.getAttribute("username");
		List<Map<String, Object>> result = null;
		
		if(username != 0){
			result = loadBuyCarGoodDataService.LoadBuyCarData(username); 
		}else{//TODO : 用户未登录
			return null;
		}
		
//		return (Map) new HashMap<String, Object>().put("goods", result);
		return result;
	}
	
}
