package ru.mulyukin.otus.java.basic.practica.practica7;

public class Robot implements Runner, Flyer {
    private int id;

    public Robot(int id) {
        this.id = id;
    }

    @Override
    public boolean run(int distance) {
        System.out.println("Робот пробежал");
        return true;
    }

    @Override
    public boolean fly() {
        System.out.println(id + " Пролетел все растояние, читер ");
        return true;
    }
}
