package com.griddynamics.democicd;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping
    public ResponseEntity<?> getResponse(String param) {
        return ResponseEntity.ok(param + "!!!!!!");
    }
}
