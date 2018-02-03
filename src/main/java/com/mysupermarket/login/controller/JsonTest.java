package com.mysupermarket.login.controller;

import java.util.Map;

import org.apache.commons.collections.map.LinkedMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Scope("prototype")
public class JsonTest {
	
	Log logger = LogFactory.getLog(getClass());

	@RequestMapping("jsonRequest")
	public @ResponseBody Map jsonRequest(){
		
		Map<String, String> result = new LinkedMap();
		result.put("id", "3115004874");
		result.put("name", "»ÆÃúÎ¾");
		
		return result;
		
	}
	
}
