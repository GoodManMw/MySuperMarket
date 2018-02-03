package com.mysupermarket.order.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysupermarket.order.service.PostOrderService;
import com.mysupermarket.pojo.Indent;
import com.mysupermarket.pojo.PayAccount;
import com.mysupermarket.pojo.ReceiveInfo;

import net.sf.json.JSONObject;

@Controller
@Scope("prototype")
public class PostOrder {
		
	private Log logger  = LogFactory.getLog(getClass());
	@Autowired
	private PostOrderService postOrderService;
	
	@RequestMapping(value = "postorder")
	public void OrderPost(@RequestParam("order")String order, HttpServletRequest request, HttpServletResponse response){
		
		HttpSession session = request.getSession();
		int username = (Integer) session.getAttribute("username");
		JSONObject json_order = JSONObject.fromObject(order);
		String name = json_order.getString("name");
		int phone = json_order.getInt("phone");
		String address = json_order.getString("address");
		int shop_id = json_order.getInt("shop_id");
		int good_id = json_order.getInt("good_id");
		String choose = "";
		List<JSONObject> list = (List<JSONObject>) json_order.get("choose");
		for(JSONObject list_item : list){
			logger.info("绫诲瀷鐨勫悕绉颁负 : " + list_item.getString("choose_name"));
			logger.info("绫诲瀷鐨勫�间负 : " + list_item.getString("choose_value"));
			choose = choose + list_item.getString("choose_name") + ":" + list_item.getString("choose_value") + ";";
		}
		int good_num = json_order.getInt("good_num");
		double sum_price = json_order.getDouble("sum_price");
		String good_comment = json_order.getString("good_comment");
		int pay_account = json_order.getInt("pay_account");
		int pay_password = json_order.getInt("pay_password");
		
		Indent postIndent = new Indent();
		Calendar calendar = Calendar.getInstance();				
		postIndent.setiUseraccount(username);
		postIndent.setiGood(good_id);
		postIndent.setiGoodchoose(choose);
		postIndent.setiGoodnum(good_num);
		postIndent.setiTake(sum_price);
		postIndent.setiComment(good_comment);
		postIndent.setiPayaccount(pay_account);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		postIndent.setiDate(year + "-" + month + "-" + day);
		
		
		logger.info("鑾峰彇鐨勬椂闂存槸 : " + year + "-" + month + "-" + day);
		logger.info("userAccount : " + username);
		logger.info("goodid : " + good_id);
		logger.info("payAccount : " + pay_account);
		
		ReceiveInfo receiveInfo = new ReceiveInfo();
		receiveInfo.setrName(name);
		receiveInfo.setrPhone(phone);
		receiveInfo.setrAddress(address);
		
		PayAccount payAccount = new PayAccount();
		payAccount.setpAccount(pay_account);
		payAccount.setpPaypassword(pay_password);
		
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, String> info = new HashMap<String, String>();
		
		int pay_status = postOrderService.VerifyPayAccount(payAccount);
		if(pay_status == 1){//鏀粯璐﹀彿楠岃瘉閫氳繃
			
			info.put("pay_status", "success");
			
			//璁㈠崟鎻愪氦涓氬姟
			int postOrderStatus = postOrderService.PostOrder(postIndent, payAccount, receiveInfo);
			if(postOrderStatus == 1){//璁㈠崟鎻愪氦鎴愬姛
				info.put("post_status", "success");
				info.put("status", "success");
			}else if(postOrderStatus == 0){//璐︽埛浣欓涓嶈冻
				info.put("post_status", "notsufficientfunds");
				info.put("status", "error");
			}else if(postOrderStatus == -1){//鏀惰幏淇℃伅鍑洪敊
				info.put("post_status", "errorreceiveinfo");
				info.put("status", "error");
			}else if(postOrderStatus == -2){//鏀粯寮傚父
				info.put("post_status", "payexception");
				info.put("status", "error");
			}else{//鏈煡閿欒
				info.put("post_status", "unknown");
				info.put("status", "error");
			}
			
		}else if(pay_status == 0){//鏀粯瀵嗙爜鍑洪敊
			info.put("pay_status", "frozenpayaccount");
			info.put("post_status","error");
			info.put("status", "error");
		}else if(pay_status == -1){//鏀粯璐︽埛宸茶鍐荤粨
			info.put("pay_status", "errorpaypassword");
			info.put("post_status","error");
			info.put("status", "error");
		}else{//涓嶅瓨鍦ㄨ鏀粯璐︽埛
			info.put("pay_status", "noexistpayaccount");
			info.put("post_status","error");
			info.put("status", "error");
		}
		
		result.put("info", info);
		
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
