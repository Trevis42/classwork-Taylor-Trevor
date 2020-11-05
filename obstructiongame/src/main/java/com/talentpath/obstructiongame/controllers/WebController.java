package com.talentpath.obstructiongame.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("")
    public String indexPage(){
        return "index";
    }
}
