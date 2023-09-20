package com.steppenwolf.SpringBootForKafkaEx2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringBootForKafkaEx2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootForKafkaEx2Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
		return args -> {

			for (int i = 0; i < 1000; i++){
				kafkaTemplate.send("kafkaExample2Topic", "Hello KafkaExample2 " + i);
			}

		};
	}
}
