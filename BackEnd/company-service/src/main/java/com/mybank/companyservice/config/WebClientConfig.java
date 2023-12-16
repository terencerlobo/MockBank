package com.mybank.companyservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.reactive.LoadBalancedExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import com.mybank.companyservice.client.ProductEnrollmentClient;

@Configuration
public class WebClientConfig {
	
	@Autowired
	private LoadBalancedExchangeFilterFunction filterFunction;
	
	@Bean
	public WebClient productEnrollmentWebClient() {
		return WebClient.builder()
				 .baseUrl("http://PRODUCT-SERVICE")
	             .filter(filterFunction)
	             .build();
	 }

	 
	 @Bean
	 public ProductEnrollmentClient productClient() {
	        HttpServiceProxyFactory httpServiceProxyFactory
	                = HttpServiceProxyFactory
	                .builder(WebClientAdapter.forClient(productEnrollmentWebClient()))
	                .build();
	        return httpServiceProxyFactory.createClient(ProductEnrollmentClient.class);
	    }
}
