package com.agcoassignment.chatbotservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
import com.agcoassignment.chatbotservice.restservice.UserClientService;
import com.agcoassignment.chatbotservice.util.Constants;

@Configuration
public class WebClientConfig {
	
	
	@Bean
	public WebClient userServiceWebClient(){
		return WebClient
				.builder()
				.baseUrl(Constants.BASE_URL)
				.build();
	}

	@Bean
	public UserClientService userClientService() {
		HttpServiceProxyFactory factory = 
				HttpServiceProxyFactory.builder(WebClientAdapter.forClient(userServiceWebClient())).build();
		return factory.createClient(UserClientService.class);
		
		
	}
	
}
