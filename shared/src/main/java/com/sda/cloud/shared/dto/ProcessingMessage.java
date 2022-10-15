package com.sda.cloud.shared.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author Paweł Recław, AmeN
 * @project cloud
 * @created 15.10.2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProcessingMessage {
    private String message;
    private LocalDateTime dateTime;
}
