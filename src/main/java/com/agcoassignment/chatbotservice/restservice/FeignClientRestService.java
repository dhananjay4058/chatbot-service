package com.agcoassignment.chatbotservice.restservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.agcoassignment.chatbotservice.model.User;
import com.agcoassignment.chatbotservice.util.Constants;

@FeignClient(name="USER-SERVICE")
public interface FeignClientRestService {
	
	@GetMapping(Constants.USER_REQUEST_MAPPING_PATH+"/getAllUsers")
	public List<User> getAllUser();


}
