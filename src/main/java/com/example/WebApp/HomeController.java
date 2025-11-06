package com.example.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World!";
    }

    @RequestMapping("/gabriel")
    public @ResponseBody String greetinggabriel() {
        return "Hello, gabriel!";
    }

    @RequestMapping("/ramide")
    public @ResponseBody String greetingramide() {
        return "Hello, ramide!";
    }

    @RequestMapping("/copia")
    public @ResponseBody String greetingcopia() {
        return "Hello, copia!";
    }

    @RequestMapping("/original")
    public @ResponseBody String greetingoriginal() {
        return "Hello, original!";
    }

    @RequestMapping("/hotfix")
    public @ResponseBody String greetinghotfix() {
        return "Hello, hotfix!";
    }
}
