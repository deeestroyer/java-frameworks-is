package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutUsController {
    @GetMapping("/about")
    public String aboutUsPage() {
        return "aboutus"; // This corresponds to "aboutus.html" in the "templates" folder
    }
}
