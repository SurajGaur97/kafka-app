package com.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.producer.service.MessageProcuder;

@RestController
@RequestMapping("/kafka/producer")
public class KafkaController {
	
	@Autowired 
	MessageProcuder producer;
	
	@PostMapping(value="/postMessage")
	public void sendMessage(@RequestParam("message") String message) {
		producer.publishToTopic(message);
	}
}
