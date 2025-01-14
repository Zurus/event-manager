package ru.event_manager.store.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Common {

    @GetMapping("/name")
    public String first() {
        return "login";
    }
}
