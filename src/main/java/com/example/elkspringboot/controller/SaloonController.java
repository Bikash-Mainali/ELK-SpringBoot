package com.example.elkspringboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PROJECT IntelliJ IDEA
 * @AUTHOR Bikash Mainali
 * @DATE 6/10/23
 */

@Slf4j
@RestController
public class SaloonController {

    @GetMapping("/api")
    public String getResponse(){
        log.info("Welcome to the ELK test api");
        return "Success";
    }
}
