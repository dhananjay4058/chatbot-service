package com.agcoassignment.chatbotservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agcoassignment.chatbotservice.model.User;
import com.agcoassignment.chatbotservice.service.UserClientService;

@RestController
@RequestMapping("/client/users")
public class UserClientController {
	
	@Autowired
	private UserClientService clientService;
	
	
	@GetMapping
	List<User> getUserDetails(){
		return clientService.getUserDetails();
	}

}
