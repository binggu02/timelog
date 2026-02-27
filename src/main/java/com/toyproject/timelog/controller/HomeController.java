package com.toyproject.timelog.controller;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
