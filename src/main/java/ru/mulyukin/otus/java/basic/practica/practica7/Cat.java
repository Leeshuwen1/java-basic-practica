package ru.mulyukin.otus.java.basic.practica.practica7;

public class Cat implements Runner {
    private String name;
    private String color;
    private int runAbility = 2000;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public boolean run(int distance) {
        boolean result = runAbility >= distance;
        System.out.println("Koт бежин " + distance + " " + result);
        return result;
    }

}
