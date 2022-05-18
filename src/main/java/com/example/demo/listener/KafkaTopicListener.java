package com.example.demo.listener;

import com.example.demo.model.ConsumerRecord;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaTopicListener {

    private Logger logger = LoggerFactory.getLogger(KafkaTopicListener.class);

    @KafkaListener(id="hosListener", topics = {"${kafka.logs.topic}"})
    public void listen(String message) {
        var mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            var consumerRecord = mapper.readValue(message, ConsumerRecord.class);
            logger.info("Consumer Record-> {}", consumerRecord);
        } catch (Exception e) {
            logger.error("Error thrown while reading json", e);
        }
    }

}
