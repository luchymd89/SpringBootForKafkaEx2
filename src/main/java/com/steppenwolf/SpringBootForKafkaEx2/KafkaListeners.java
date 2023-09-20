package com.steppenwolf.SpringBootForKafkaEx2;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "kafkaExample2Topic", groupId = "groupId")
    void listener(String data){
       System.out.println("Listener received: " + data + " >!!!");
    }
}
