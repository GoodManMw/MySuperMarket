package com.mysupermarket.goodmanage.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("prototype")
public class DownLoadFile {

	private Log logger = LogFactory.getLog(getClass());
	@RequestMapping(value = "downloadfile")
	public void DownLoad(HttpServletRequest request, HttpServletResponse response){
		
		String filepath = request.getSession().getServletContext().getRealPath("good_image/trouser_image");
		File file = new File(filepath, "trouser_1.jpg");
		FileInputStream fis = null;
		response.setHeader("Content-Disposition","attachment;fileName=" + file.getName());
		response.setCharacterEncoding("application/octet-stream;charset=UTF-8");
		response.setHeader("Content-Length", String.valueOf(file.length()));  
		OutputStream os = null;
		try {
			fis = new FileInputStream(file);
			os = response.getOutputStream();
			byte[] buff = new byte[1024];
			int length = 0;
			while((length = fis.read(buff)) > 0){
				os.write(buff, 0, length);
			}
			os.flush();
			os.close();
			fis.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
}
