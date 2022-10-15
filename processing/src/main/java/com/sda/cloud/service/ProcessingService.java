package com.sda.cloud.service;

import com.sda.cloud.shared.dto.ProcessingMessage;
import com.sda.cloud.shared.kafka.Topic;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author Paweł Recław, AmeN
 * @project cloud
 * @created 15.10.2022
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class ProcessingService {
    private final KafkaTemplate<String, ProcessingMessage> kafkaTemplate;

    public void handle(String message) {
        log.info("Sending to kafka topic.");
        kafkaTemplate.send(Topic.PROCESSING_TOPIC, new ProcessingMessage(message, LocalDateTime.now()));
    }
}
