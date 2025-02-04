package ru.sharova.springapp;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;


public class ClassicalMusic implements Music {
    List<String> classicalMusicList = new ArrayList<>();

    {
        classicalMusicList.add("classical music one");
        classicalMusicList.add("classical music two");
        classicalMusicList.add("classical music three");
    }


    public void doMyInit() {
        System.out.println("init method classical music");
    }


    public void doMyDestroy() {
        System.out.println("destroy method classical music");
    }

    @Override
    public List<String> getSong() {
        return classicalMusicList;
    }
}
