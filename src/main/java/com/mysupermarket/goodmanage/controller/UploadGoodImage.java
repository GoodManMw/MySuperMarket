package com.mysupermarket.goodmanage.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
@Scope("prototype")
public class UploadGoodImage {

	private Log logger = LogFactory.getLog(getClass());
	@RequestMapping(value = "uploadimage")
	public void SaveGoodImage(MultipartHttpServletRequest request, HttpServletResponse response){
		
		MultipartFile file = request.getFile("uploadfile");
		String file_name = file.getOriginalFilename();
		InputStream is = null;
		try {
			is = file.getInputStream();
			OutputStream os = null;
			File target_file = new File(request.getSession().getServletContext().getRealPath("/good_image"), file_name);
			FileOutputStream fos = new FileOutputStream(target_file);
			byte[] buff = new byte[1024];
			int length = 0;
			while((length = is.read(buff)) > 0){
				fos.write(buff, 0, length);
			}
			fos.flush();
			fos.close();
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
