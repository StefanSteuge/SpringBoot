package com.example.demo.uuid;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.UUID;

@Service
public class UuidService {

    public UUID getUuids() {
        return UUID.randomUUID();

    }



}
