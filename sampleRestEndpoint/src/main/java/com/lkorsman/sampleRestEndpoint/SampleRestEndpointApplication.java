package com.lkorsman.sampleRestEndpoint;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SampleRestEndpointApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleRestEndpointApplication.class, args);

	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
		return args -> {
			for (int i = 0; i < 50; i++) {
				kafkaTemplate.send("sampleRestEndpoint", "hello kafka :) " + i);
			}
		};
	}

}
