package com.kbouali.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "kbouali", groupId = "foo")
    void listener(String data) {
        System.out.println("Listener received: " + data + " :D !");
    }
}
