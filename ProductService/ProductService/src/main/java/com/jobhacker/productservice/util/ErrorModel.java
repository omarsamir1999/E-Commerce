package com.jobhacker.productservice.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorModel {

    private String message;
    private LocalDateTime timestamp;
    private String urlFailurePath;
}
