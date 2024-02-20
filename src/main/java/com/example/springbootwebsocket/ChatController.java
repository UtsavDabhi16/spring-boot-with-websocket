package com.example.springbootwebsocket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatController {

    @RequestMapping("/")
    public String getChat(){
        return "index";
    }

}
