package ru.mulyukin.otus.java.basic.practica.practica7;

public class Man implements Runner {
    private String name;

    public Man(String name) {
        this.name = name;
    }

    public boolean run(int distance){
        System.out.println(name + " Бегать не умеет, очень толстый");
        return false;
    }
}
