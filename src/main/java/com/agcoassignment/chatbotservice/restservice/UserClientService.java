package com.agcoassignment.chatbotservice.restservice;

import java.util.List;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import com.agcoassignment.chatbotservice.model.User;
import com.agcoassignment.chatbotservice.util.Constants;

@HttpExchange(Constants.EXCHANGE_API_PATH)
public interface UserClientService {
	
	@GetExchange(Constants.GET_ALL_USER_API)
    List<User> getUserDetails();

}
