package ru.sharova.springapp;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    public void init() {
        System.out.println("init method rock music");
    }

    public void destroy() {
        System.out.println("destroy method rock music");
    }

    @Override
    public String getSong() {
        return "Rock music";
    }
}
