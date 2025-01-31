package ru.sharova.springapp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JazzMusic implements Music {
    List<String> jazzMusicList = new ArrayList<>();

    {
        jazzMusicList.add("jazz music one");
        jazzMusicList.add("jazz music two");
        jazzMusicList.add("jazz music three");
    }

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
    public List<String> getSong() {
        return jazzMusicList;
    }
}
