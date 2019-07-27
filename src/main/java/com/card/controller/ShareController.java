package com.card.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.card.model.Postcard;
import com.card.model.Song;
import com.card.service.PostcardService;
import com.card.service.SongService;
import com.card.util.Savefile;

@Controller

public class ShareController {
	@Resource(name="songServiceImpl")
	private SongService songservice;
	
	@Resource(name="postcardServiceImpl")
	private PostcardService pcservice;
	
	@RequestMapping("/writepostcard")
	public void writepostcard(){
		//跳转到写postcard的页面
	}
	@RequestMapping("/share")
	public void share(){
		//将请求的表单数据存入数据库中
	}
	@RequestMapping("/savepostcard")
	public String savemusictopath(@RequestParam("file")MultipartFile[] files,HttpServletRequest request) throws Exception {
		//判断是否上传成功
		boolean isimageuploadsuccess;
		boolean  issonguoloadsuccess;
		
		//获得请求的cookie，并从cookie中获取用户id
		Cookie[] cookie = request.getCookies();
		//将文本信息保存到数据库中
		Song song = new Song();
		String songname = request.getParameter("songname");
		//通过session获得上传用户的id
		HttpSession session=request.getSession(true);
		int uploaduser_id = (int) session.getAttribute("user_id");
		System.out.println(uploaduser_id);
		int love_num =0;
		//将值赋予song对象
		song.setName(songname);
		song.setUploaduserId(uploaduser_id);
		song.setLoveNum(love_num);
		
		
		Postcard postcard = new Postcard();
		String text = request.getParameter("story");
		Date date = new Date();
		// 将当前时间转化为sql时间
		java.sql.Date postdate = new java.sql.Date(date.getTime());
		postcard.setText(text);
		postcard.setPostdate(postdate);
		postcard.setUserId(uploaduser_id);
		
		   
		//将文件保存到指定的位置
		String fileSpace="E:/代码/myeclipse-workpace/musicpostcard/WebRoot/upload";
		//保存到数据库中的相对路径(在命名空间每个不同用户存的文件)
		String songuploadPathDB="/"+"music";
		String stampimageuploadPathDB="/"+"stampimage";
		if(files!=null && files.length==2)
		{
				if(files[0]!=null && !files[0].isEmpty())
				{
					String filename0 = files[0].getOriginalFilename();
		            Savefile sf0 = new Savefile(fileSpace, stampimageuploadPathDB, filename0, files[0]);
		            isimageuploadsuccess = sf0.savefile();
		            song.setImagePath(stampimageuploadPathDB+"/"+filename0);
				}
				if(files[1]!=null && !files[1].isEmpty())
				{
					String filename1 = files[1].getOriginalFilename();
		            Savefile sf1 = new Savefile(fileSpace, songuploadPathDB, filename1, files[1]);
		            issonguoloadsuccess =sf1.savefile();
		            song.setPath(songuploadPathDB+"/"+filename1);
				}
				else{
					return "fail";
				}
		}
		
		songservice.insertsong(song);
		int song_id = song.getSongId();
		postcard.setSongId(song_id);
		pcservice.insertpc(postcard);
		return "postcarddisplay";
	   	}
}
