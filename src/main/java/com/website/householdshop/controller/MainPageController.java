package com.website.householdshop.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class MainPageController {

        @GetMapping("/")
        public String hello(Model model) {
            model.addAttribute("title", "Главня страница");
            return "index";
        }
    }