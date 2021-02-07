package com.example.gcp.deploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductControler {

    @GetMapping("/all")
    public String returnAll() {
        return "All Product";
    }
}
