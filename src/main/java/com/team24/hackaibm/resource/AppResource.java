package com.team24.hackaibm.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/api/v1/app")
// localhost:9090/api/v1/app
public class AppResource {

    @GetMapping
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello There!");
    }
}
