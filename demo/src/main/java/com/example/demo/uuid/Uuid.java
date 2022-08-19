package com.example.demo.uuid;

import java.util.UUID;

public class Uuid {

    private UUID uuid;
    private int size;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(Uuid uuid) {
        this.uuid = uuid.getUuid();
    }

    public Uuid(Uuid uuid, int size) {
        this.uuid = uuid.getUuid();
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
