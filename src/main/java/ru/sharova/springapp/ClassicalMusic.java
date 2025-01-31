package ru.sharova.springapp;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    public void doMyInit() {
        System.out.println("init method classical music");
    }

    public void doMyDestroy() {
        System.out.println("destroy method classical music");
    }

    @Override
    public String getSong() {
        return "Classical music";
    }
}
