package com.lemavos.mcf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Welcome To MCF");
        model.addAttribute("message", "You are now in White Label, please insert a valid URL!");
        return "whiteLabel"; // busca whiteLabel.html no templates
    }
}
