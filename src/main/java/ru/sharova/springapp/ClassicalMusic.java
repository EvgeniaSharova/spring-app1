package ru.sharova.springapp;

public class ClassicalMusic implements Music {

    public void doMyInit() {
        System.out.println("method do my init");
    }

    public void doMyDestroy(){
        System.out.println("method do my destroy");
    }

    @Override
    public String getSong() {
        return "Classical music";
    }
}
