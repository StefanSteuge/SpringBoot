package com.example.demo.uuid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.UUID;

@Controller
public class UuidController {

    @Autowired
    private UuidService uuidService;

    @GetMapping("/uuid")
    @ResponseBody
    public List<UUID> uuidList() {
        return uuidService.getUuids();
    }

    @GetMapping("/")
    public String loremIpsum(Model model) {
        model.addAttribute("title", "Lorem Ipsum");
        return "loremIpsumPage";
    }

}
