package de.yiku.singletonpattern;

import java.util.UUID;

public class Singleton {
    private final String uuid;

    public Singleton() {
        this.uuid = UUID.randomUUID().toString();
    }

    public String getUuid() {
        return uuid;
    }
}

