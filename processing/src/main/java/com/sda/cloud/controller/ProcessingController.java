package com.sda.cloud.controller;

import com.sda.cloud.service.ProcessingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Paweł Recław, AmeN
 * @project cloud
 * @created 15.10.2022
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/process")
public class ProcessingController {
    private final ProcessingService processingService;

    @GetMapping()
    public void process(@RequestParam(required = false) String message){
        log.info("Called processing endpoint");
        processingService.handle(message);
    }
}
