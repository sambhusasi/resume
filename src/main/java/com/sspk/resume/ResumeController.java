package com.sspk.resume;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResumeController {

    @GetMapping ("/")
    public String show() {
        System.out.println(" ->");
        return "home";
    }

}
