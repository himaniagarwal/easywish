package com.easywish;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/easywish/retailers")
public class RetailerController {

    @GetMapping
    public ResponseEntity getRetailers() {
        return ResponseEntity.ok(List.of("Name1", "Name2"));
    }

}
