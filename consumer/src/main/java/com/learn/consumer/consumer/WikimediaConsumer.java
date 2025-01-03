package com.learn.consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WikimediaConsumer {

    @KafkaListener(topics = "wikimedia-stream",groupId = "earliest")
    public void consumeMessage(String message){
        log.info(String.format("Consuming from wikimedia-stream topic:: %s",message));

    }
}
