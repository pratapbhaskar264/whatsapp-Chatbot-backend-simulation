package com.bhaskar.whatsApp_Chatbot.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class postController {

    private static final Logger logger = LoggerFactory.getLogger(postController.class);

    private final Service service;

    //constructor injection for tight coupling
    public postController(Service service) {
        this.service = service;
    }


    //check
//    @GetMapping
//    public String greet(){
//        return "heyhey";
//    }

}
