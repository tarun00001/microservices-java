package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(name = "ErrorResponse", description = "Schema to hold Error Response information")
@Data @AllArgsConstructor
public class ErrorResponseDto {

    @Schema( description = "Path of the API invoked by Client")
    private String apiPath;

    @Schema( description = "Error code representing the error happened")
    private HttpStatus errorCode;

    @Schema( description = "Error message representing the error happened")
    private String errorMessage;

    @Schema( description = "Time representing when the error happened")

    private LocalDateTime errorTime;
}