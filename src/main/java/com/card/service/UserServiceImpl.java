package com.card.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.card.mapper.UserMapper;
import com.card.model.Postcard;
import com.card.model.Song;
import com.card.model.User;
import com.card.model.UserExample;


@Service(value="userServiceImpl")

public class UserServiceImpl implements UserService {
	
	
	@Resource(name="userMapper")
	private UserMapper usermapper;

	@Override
	public void insertuser(User user) {
	usermapper.insert(user);
	}
    @Transactional
	@Override
	public List<User> checkuser(User user) {
	   UserExample userexample = new UserExample();
	   userexample.or().andNameEqualTo(user.getName()).andPasswordEqualTo(user.getPassword());
	   List<User> dbuser = usermapper.selectByExample(userexample);
	//System.out.println(dbuser.size());
	   if(dbuser.size()>0){
		   return dbuser;
	   }
	   else
		   return null;
}
}
