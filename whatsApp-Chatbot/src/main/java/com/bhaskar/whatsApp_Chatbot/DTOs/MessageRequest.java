package com.bhaskar.whatsApp_Chatbot.DTOs;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MessageRequest {

    @NotBlank(message = "message must be at least of single character")
    private String message;

    //getters and setters will be invoked by @Data itself .. added mvn dependency

}
