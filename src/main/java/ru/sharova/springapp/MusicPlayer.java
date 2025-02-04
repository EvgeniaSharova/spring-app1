package ru.sharova.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    private Music music3;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer() {
    }

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2,
                       @Qualifier("jazzMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String playMusic(GenresSongs genresSongs) {
        int randomNumber = (int) (Math.random() * 3);
        switch (genresSongs) {
            case CLASSICAL -> {
                return (String) music1.getSong().get(randomNumber);
            }
            case ROCK -> {
                return (String) music2.getSong().get(randomNumber);
            }
            case JAZZ -> {
                return (String) music3.getSong().get(randomNumber);
            }
        }
        return null;
    }
}
