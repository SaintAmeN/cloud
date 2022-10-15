package com.sda.cloud.receiver.service;

import com.sda.cloud.shared.dto.ProcessingMessage;
import com.sda.cloud.shared.kafka.Topic;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Paweł Recław, AmeN
 * @project cloud
 * @created 15.10.2022
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class ReceivingService {

    private final List<ProcessingMessage> receivedMessages = new ArrayList<>();

    @KafkaListener(topics = {Topic.PROCESSING_TOPIC})
    public void receive(ProcessingMessage message) {
        log.info("Received message: " + message);

        receivedMessages.add(message);
    }

    public List<ProcessingMessage> getProcessedMessages() {
        return receivedMessages;
    }
}
