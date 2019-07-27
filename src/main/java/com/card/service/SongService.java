package com.card.service;

import com.card.model.Song;

public interface SongService {
	public void insertsong(Song song);
	public boolean isrecord(Song song);
	public void loveadd(Song song );
	public Song selectsong(int id);
}
