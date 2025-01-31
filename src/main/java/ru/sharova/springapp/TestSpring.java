package ru.sharova.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic(GenresSongs.CLASSICAL));
        System.out.println(musicPlayer.playMusic(GenresSongs.JAZZ));
        System.out.println(musicPlayer.playMusic(GenresSongs.ROCK));
        context.close();
    }
}
