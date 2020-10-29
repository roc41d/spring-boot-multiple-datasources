package com.roc41d.springbootmultipledatasources.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    public ResponseEntity<String> test() {

        return ResponseEntity.ok("It Works");
    }
}
