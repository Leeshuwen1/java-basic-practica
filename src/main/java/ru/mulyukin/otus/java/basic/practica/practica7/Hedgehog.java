package ru.mulyukin.otus.java.basic.practica.practica7;

public class Hedgehog implements Runner {
    int power;

    public Hedgehog(int power) {
        this.power = power;
    }

    @Override
    public boolean run(int distance) {
        boolean result = power * 200 >= distance;
        System.out.println("Ёж бежин " + distance + " " + result);
        return result;
    }
}
