package com.kafka.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.consumer.service.MessageProducer;

@RestController
@RequestMapping("/kafka/consumer")
public class KafkaController {

	@Autowired 
	MessageProducer producer;
	
	@PostMapping(value="/postMessage")
	public void sendMessage(@RequestParam("message") String message) {
		producer.publishToTopic(message);
	}
	
}
