package com.bhaskar.whatsApp_Chatbot.Controllers;

import com.bhaskar.whatsApp_Chatbot.DTOs.MessageRequest;
import com.bhaskar.whatsApp_Chatbot.DTOs.MessageResponse;
import com.bhaskar.whatsApp_Chatbot.Service.ChatService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/send")
public class PostController {

    private static final Logger logger = LoggerFactory.getLogger(PostController.class);

    private final ChatService chatService;

    //constructor injection for tight coupling
    public PostController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping
    public ResponseEntity<MessageResponse> handleMessage(@Valid @ResponseBody MessageRequest messageRequest){

        logger.info("POST /send called");

        String reply = chatService.getReply(messageRequest.getMessage());

        return ResponseEntity.ok(new MessageResponse(reply));

    }


    //check
//    @GetMapping
//    public String greet(){
//        return "heyhey";
//    }

}
