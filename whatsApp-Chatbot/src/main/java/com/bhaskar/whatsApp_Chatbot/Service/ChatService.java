package com.bhaskar.whatsApp_Chatbot.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class ChatService {

    private static Logger logger = LoggerFactory.getLogger(service.class);

   public String getReply(String message) {

       logger.info("Message Incoming : " , message);

       String reply =  switch (message.trim().toLowerCase()) {
           case "hi" -> "Hello";
           case "bye" -> "Goodbye";
           default -> "I don't understand";
       };
           logger.info("Message Outgoing : " , reply);
           return reply;
   }


}
