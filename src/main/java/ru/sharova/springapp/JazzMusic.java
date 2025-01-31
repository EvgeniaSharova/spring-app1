package ru.sharova.springapp;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {
    private JazzMusic() {
    }

    public static JazzMusic getJazzMusic() {
        return new JazzMusic();
    }

    public void init() {
        System.out.println("init method jazz music");
    }

    public void destroy() {
        System.out.println("destroy method jazz music");
    }

    @Override
    public String getSong() {
        return "jazz music";
    }
}
