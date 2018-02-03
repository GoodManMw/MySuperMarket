package com.mysupermarket.gooddata.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysupermarket.gooddata.controller.ao.DataToAddToBuyCarEntity;
import com.mysupermarket.gooddata.service.AddDataToBuyCarService;

@Controller
@Scope("prototype")
public class AddToDataBuyCar {

	private Log logger = LogFactory.getLog(getClass());
	@Autowired
	private AddDataToBuyCarService addDataToBuyCarService;
	
	@RequestMapping("addDataToBuyCar")
	public @ResponseBody Map PostDataToBuyCar(@RequestBody DataToAddToBuyCarEntity data, HttpServletRequest req){
		
		HttpSession session = req.getSession();
		int useraccount = -1; 
		useraccount = (int)session.getAttribute("username");
		
		return addDataToBuyCarService.PostDataToBuyCar(data, useraccount);
	}
	
}
