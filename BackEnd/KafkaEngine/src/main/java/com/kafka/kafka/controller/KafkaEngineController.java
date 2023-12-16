package com.kafka.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.kafka.data.KafkaResponse;
import com.kafka.kafka.data.ProductDetails;

@RestController
@RequestMapping("/kafka-engine")
public class KafkaEngineController {
	
	
	@Autowired
	KafkaTemplate<String, ProductDetails> kafkaTemplate;
	
	
	@PostMapping("/publishmsg")
	public ResponseEntity<KafkaResponse> publishMessage(@RequestBody ProductDetails productDetails){
		System.out.println("It comes here...");
		KafkaResponse response = new KafkaResponse();
		kafkaTemplate.send("TestTopic", productDetails);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

}
