package com.sda.cloud.receiver.controller;

import com.sda.cloud.receiver.service.ReceivingService;
import com.sda.cloud.shared.dto.ProcessingMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Paweł Recław, AmeN
 * @project cloud
 * @created 15.10.2022
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/receiver")
public class ReceiverController {
    private final ReceivingService receivingService;

    @GetMapping()
    public List<ProcessingMessage> getProcessedMessages() {
        log.info("Getting all processed messages");
        return receivingService.getProcessedMessages();
    }
}
