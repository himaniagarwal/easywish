package com.easywish.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/easywish/suppliers")
public class SupplierController {

    @GetMapping
    public ResponseEntity getSuppliers() {
        return ResponseEntity.ok(List.of("Name1", "Name2"));
    }
}
