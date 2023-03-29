package com.agcoassignment.chatbotservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import com.agcoassignment.chatbotservice.service.UserClientService;

@Configuration
public class WebClientConfig {
	
	
	@Bean
	public WebClient userServiceWebClient(){
		return WebClient
				.builder()
				.baseUrl("http://localhost:8080")
				.build();
	}

	@Bean
	public UserClientService userClientService() {
		HttpServiceProxyFactory factory = 
				HttpServiceProxyFactory.builder(WebClientAdapter.forClient(userServiceWebClient())).build();
		return factory.createClient(UserClientService.class);
		
		
	}
	
}
