package com.kafka.kafka;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.kafka.kafka.data.ProductDetails;

@Configuration
public class KafkaConfig {
	
	@Bean
	public DefaultKafkaProducerFactory<String, ProductDetails> producerConfig() {
		
		Map<String, Object> configMap = new HashMap<>();
		
		configMap.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		configMap.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		configMap.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		
		return new DefaultKafkaProducerFactory<>(configMap);
		
	}
	
	@Bean
	public KafkaTemplate<String, ProductDetails> kafkaTemplate(){
		return new KafkaTemplate<>(producerConfig());
		
	}

}
