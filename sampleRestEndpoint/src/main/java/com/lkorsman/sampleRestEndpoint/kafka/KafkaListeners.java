package com.lkorsman.sampleRestEndpoint.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    private static final Logger log = LoggerFactory.getLogger(KafkaListener.class);

    @KafkaListener(topics = "sampleRestEndpoint", groupId = "food")
    void listener(String data) {
        log.info("Listener received: " + data + " ^-^");
    }
}
