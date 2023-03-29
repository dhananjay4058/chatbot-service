package com.agcoassignment.chatbotservice.service;

import java.util.List;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import com.agcoassignment.chatbotservice.model.User;

@HttpExchange("/api/users")
public interface UserClientService {
	
	
	@GetExchange
    List<User> getUserDetails();

}
