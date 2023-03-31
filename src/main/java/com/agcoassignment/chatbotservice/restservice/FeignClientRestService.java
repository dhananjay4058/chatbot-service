package com.agcoassignment.chatbotservice.restservice;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.agcoassignment.chatbotservice.model.User;

@FeignClient(name="USER-SERVICE")
public interface FeignClientRestService {
	
    @GetMapping("/user-service/v1"+"/users")
	public List<User> getAllUser();


}
