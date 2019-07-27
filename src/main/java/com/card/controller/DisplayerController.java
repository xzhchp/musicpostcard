package com.card.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.card.model.Postcard;
import com.card.model.Song;
import com.card.service.PostcardService;
import com.card.service.SongService;

@Controller
@RequestMapping("/display")
public class DisplayerController {
	@Resource(name="postcardServiceImpl")
	private PostcardService pcservice;
	
	@Resource(name="songServiceImpl")
	private SongService songservice;
	
	
	@RequestMapping("/newpostcard")
	@ResponseBody
	public Postcard disnewplaypostcard(HttpServletRequest request){
		Postcard pc = pcservice.selectpostcardbyrandom();
		System.out.println(pc.getText());
		System.out.println(pc.getSongId());
		return pc;
		
	}
	@RequestMapping("/newsong")
	@ResponseBody
	public Song newsong(Song song ){
		return songservice.selectsong(song.getSongId());
	}
	
	@RequestMapping("/record")
	public String displayrecord(){
		
		return null;	
	}
	

	

}
