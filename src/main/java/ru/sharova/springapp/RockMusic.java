package ru.sharova.springapp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class RockMusic implements Music {

    List<String> rockMusicList = new ArrayList<>();

    {
        rockMusicList.add("rock music one");
        rockMusicList.add("rock music two");
        rockMusicList.add("rock music three");
    }

    public void init() {
        System.out.println("init method rock music");
    }

    public void destroy() {
        System.out.println("destroy method rock music");
    }

    @Override
    public List<String> getSong() {
        return rockMusicList;
    }
}
