package com.mysupermarket.login.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysupermarket.login.service.SaveUserAccountService;
import com.mysupermarket.pojo.UserAccount;

import net.sf.json.JSONObject;

@Controller
@Scope("prototype")
public class Register {
	
	private Log logger = LogFactory.getLog(getClass());
	@Autowired
	private SaveUserAccountService saveUserAccountService;
	
	@RequestMapping(value = "register")
	public void SaveAccount(@RequestParam("account")String account, HttpServletResponse response){
		
		//浠庤姹備腑鑾峰彇娉ㄥ唽璐﹀彿,瀵嗙爜,閭
		JSONObject json_account = JSONObject.fromObject(account);
		int username = (Integer)json_account.get("username");
		String email = (String)json_account.get("email");
		String password = (String)json_account.get("password");
		logger.info("鑾峰彇鐨勮处鍙蜂负 : " + username + " 鑾峰彇鍒扮殑email涓� : " + email + " 鑾峰彇鍒扮殑password涓� : " + password);
		
		UserAccount userAccount = new UserAccount();
		userAccount.setUaUsername(username);
		userAccount.setUaPassword(password);
		userAccount.setUaEmail(email);
		
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, String> info = new HashMap<String, String>();
		
		//璋冪敤service灞傛墽琛屾敞鍐屼笟鍔�
		int status;
		status = saveUserAccountService.Save(userAccount);
		if(status == 1){
			info.put("status", "success");
		}else{
			info.put("status", "existaccount");
		}
		result.put("info", info);
		
		//璋冪敤HttpServletResponse 鍝嶅簲杩斿洖缁撴灉
		response.setContentType("text/json;charset=utf-8");
		response.setHeader("Cache-Control", "no-cache");
		PrintWriter out = null;
		try {
			out = response.getWriter();
			out.print(JSONObject.fromObject(result));
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.info("鑾峰彇PrintWriter鍑洪敊");
		}
		
	}
	
}
