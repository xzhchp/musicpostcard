package com.card.controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.card.model.User;
import com.card.service.UserService;

@Controller

public class UserController {

	@Resource(name="userServiceImpl")
	private UserService userservice;
	
	@RequestMapping("/land")
	public String userland(HttpServletRequest request){
		HttpSession session=request.getSession(true);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User();
		user.setName(username);
		user.setPassword(password);
		List<User> dbuser = userservice.checkuser(user);
		if(dbuser.size()==1){
			 session.setAttribute("user_id",dbuser.get(0).getUserId());
			 System.out.println(session.getAttribute("user_id"));
			 return("postcarddisplay");
		}
		else{
			return("fail");
		}
			
	}
}
