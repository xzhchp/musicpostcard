package com.card.service;

import java.util.List;

import com.card.model.Postcard;
import com.card.model.Song;
import com.card.model.User;

public interface UserService {
public void insertuser(User user);
public List<User> checkuser(User user);
}
