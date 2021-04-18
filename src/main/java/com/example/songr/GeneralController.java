package com.example.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GeneralController {
    @GetMapping("/")
    public String splashPageHandler(Model m){

        return "splashPage";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String showHelloWorld(){
        return "Hello World";
    }


    @GetMapping("/capitalize/{word}")
    public String getCapitalize(Model m, @PathVariable("word") String word){
        String newWord = word.toUpperCase();
        m.addAttribute("word",newWord);
        return "helloTemplate.html";
    }



}

