package ru.sharova.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        System.out.println("--------");
        RockMusic firstRockMusic = context.getBean("rockMusic", RockMusic.class);
        RockMusic secondRockMusic = context.getBean("rockMusic", RockMusic.class);
        System.out.println(firstRockMusic.getSong());
        System.out.println(secondRockMusic.getSong());
        context.close();
    }
}
