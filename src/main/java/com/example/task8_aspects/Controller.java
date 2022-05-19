package com.example.task8_aspects;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/getRequest")
    public ResponseEntity<String> createResponse() {
        return new ResponseEntity<>("All OK", HttpStatus.OK);
    }
}
