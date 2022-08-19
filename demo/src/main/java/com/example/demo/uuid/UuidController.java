package com.example.demo.uuid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class UuidController {

    @Autowired
    private UuidService uuidService;

@GetMapping("/uuid")
    public List<UUID> uuidList() {
       return uuidService.getUuids();
    }

}
