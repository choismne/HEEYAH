package com.test1.jpa_exercise.get_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class getDemoController {
    private getDemoService getDemoService;

    public getDemoController(getDemoService getDemoService){
        this.getDemoService = getDemoService;
    }

    @GetMapping("/get_user")
    public List<users> getConnection() {
        return getDemoService.findUsers();
    }
}