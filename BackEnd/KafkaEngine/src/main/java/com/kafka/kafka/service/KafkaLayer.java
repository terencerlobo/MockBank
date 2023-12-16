package com.kafka.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafka.kafka.data.ProductDetails;

@Service
public class KafkaLayer {
	
	@Autowired
	private KafkaTemplate<String, ProductDetails> kafkaTemplate;
	
	public String publishMessage(ProductDetails productDetails) {
		kafkaTemplate.send("TestTopic", productDetails);
		return "Message published successfully";
	}

}
