package com.example.camel;

import org.springframework.beans.factory.annotation.Value;


public class MavenInfo {
    private final String name;
    private final String artefact;

    public MavenInfo(String name, String artefact) {
        this.name = name;
        this.artefact = artefact;
    }

    @Override
    public String toString() {
        return "MavenInfo{" +
                "name='" + name + '\'' +
                ", artefact='" + artefact + '\'' +
                '}';
    }
}
