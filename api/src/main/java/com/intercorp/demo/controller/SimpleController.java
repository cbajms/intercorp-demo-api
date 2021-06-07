package com.intercorp.demo.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class SimpleController {
    @Value("${spring.application.name}")
    String appName;

    @ApiOperation(value = "Welcome message simple controller")
    @GetMapping()
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("Bienvenido a " + appName);
    }
}
