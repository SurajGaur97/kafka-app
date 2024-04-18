package com.kafka.producer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

	@KafkaListener(topics = "mytopic", groupId = "mygroup1")
	public void consumeFromTopic(String message) {
		System.out.println("Consummed message " + message);
	}
	
}
