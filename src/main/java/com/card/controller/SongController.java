package com.card.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.card.model.Song;
import com.card.service.SongService;

@Controller
@RequestMapping("/song")
public class SongController {
	@Resource(name="songServiceImpl")
	private SongService songservice;

	@RequestMapping("/loveadd")
	public void loveadd(Song song){
		Song lovedsong = songservice.selectsong(song.getSongId());
		Integer oldlovenum = lovedsong.getLoveNum();
		songservice.loveadd(lovedsong);
	}
}
