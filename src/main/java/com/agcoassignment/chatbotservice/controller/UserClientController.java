package com.agcoassignment.chatbotservice.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.agcoassignment.chatbotservice.model.User;
import com.agcoassignment.chatbotservice.restservice.FeignClientRestService;
import com.agcoassignment.chatbotservice.restservice.UserClientService;
import com.agcoassignment.chatbotservice.util.Constants;

@RestController
@RequestMapping(Constants.CHATBOT_REQUEST_MAPPING_PATH)
public class UserClientController {
	
	private static final Logger log = LoggerFactory.getLogger(UserClientController.class);

	@Autowired
	private UserClientService clientService;
	@Autowired
	private FeignClientRestService feignClientRestService;
	
	
	@GetMapping("/web-client")
	List<User> getUserDetails(){
    	Optional<List<User>> optionalUserList = Optional.ofNullable(clientService.getUserDetails());
        log.info("List of All User Data using webclient users:{}",optionalUserList.get());
		return optionalUserList.get();
	}
	
	@GetMapping("/feign-client")
	List<User> getAllUser(){
    	Optional<List<User>> optionalUserList = Optional.ofNullable(feignClientRestService.getAllUser());
        log.info("List of All User Data using feign client users:{}",optionalUserList.get());
		return optionalUserList.get();
	}

}
