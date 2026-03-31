package com.bhaskar.whatsApp_Chatbot.Controllers;

import com.bhaskar.whatsApp_Chatbot.DTOs.MessageRequest;
import com.bhaskar.whatsApp_Chatbot.DTOs.MessageResponse;
import jakarta.validation.Valid;
import org.apache.logging.log4j.message.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/send")
public class postController {

    private static final Logger logger = LoggerFactory.getLogger(postController.class);

    private final Service service;

    //constructor injection for tight coupling
    public postController(Service service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<MessageResponse> handleMessage(@Valid @ResponseBody MessageRequest messageRequest){

        logger.info("POST /send called");

        String reply = service.getReply(messageRequest.getMessage());

        return ResponseEntity.ok(new MessageResponse(reply));

    }


    //check
//    @GetMapping
//    public String greet(){
//        return "heyhey";
//    }

}
