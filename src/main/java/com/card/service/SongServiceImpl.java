package com.card.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.card.mapper.SongMapper;
import com.card.model.Song;
import com.card.model.SongExample;

@Service(value="songServiceImpl")
public class SongServiceImpl implements SongService {

	@Resource(name="songMapper")
	private SongMapper songmapper;
	
	@Transactional
	@Override
	public void insertsong(Song song) {
		songmapper.insert(song);
	}

	@Override
	public boolean isrecord(Song song) {
		// 判断歌曲是否能上架
		return false;
	}

	@Override
	public void loveadd(Song song) {
		// TODO Auto-generated method stub
		Integer songid = song.getSongId();
		Integer oldlovenum = song.getLoveNum();
		Integer newlovenum = oldlovenum+1;
		song.setLoveNum(newlovenum);
		SongExample loveex = new SongExample();
		loveex.or().andSongIdEqualTo(songid);
		songmapper.updateByExample(song,loveex);
	}

	@Override
	public Song selectsong(int id) {
		// TODO Auto-generated method stub
		Song song = songmapper.selectByPrimaryKey(id);
		return song;
	}

}
