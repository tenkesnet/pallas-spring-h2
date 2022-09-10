package com.pallas.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model m)
    {
        m.addAttribute("tilte","Pallas oktatás");
        return "index";
    }
}
