package com.example.demo.loremIpsumIndexPage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LoremIpsumController {

    @GetMapping
    public String loremIpsum() {
        return "Lorem Ipsum";
    }
}
