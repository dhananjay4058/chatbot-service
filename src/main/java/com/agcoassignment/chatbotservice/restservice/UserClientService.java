package com.agcoassignment.chatbotservice.restservice;

import java.util.List;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import com.agcoassignment.chatbotservice.model.User;

@HttpExchange("/user-service/v1")
public interface UserClientService {
	
	@GetExchange("/users")
    List<User> getUserDetails();

}
