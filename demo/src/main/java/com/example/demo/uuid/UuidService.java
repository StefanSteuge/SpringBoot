package com.example.demo.uuid;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Service
public class UuidService {

    public List<UUID> getUuids() {
        return Collections.singletonList(UUID.randomUUID());

    }

}
