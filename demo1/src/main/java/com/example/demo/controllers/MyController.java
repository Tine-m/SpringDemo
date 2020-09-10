package com.example.demo.controllers;

import com.example.demo.services.Lommeregner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello world!";
    }

    @GetMapping("/tal")
    @ResponseBody
    public int skrivTal() {
        return 100;
    }

    @GetMapping("/echo")
    @ResponseBody
    public String echo(@RequestParam String navn) {
        return navn.toUpperCase();
    }

    @GetMapping("/produkt")
    @ResponseBody
    public int echo(@RequestParam int tal) {
        Lommeregner lr = new Lommeregner();
        return lr.produkt(tal);
    }
}
