package ru.mulyukin.otus.java.basic.practica.practica6;

public class Cat {
    private String name;
    private int age;
    private boolean isHungry;

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public String getName() {
        return name;
    }

    public Cat(String name, int age) {
        this.age = age;
        this.name = name;
        this.isHungry = true;
    }

    public void info() {
        System.out.println(name + " возраст " + age);
    }

    public void eat(Plate plate) {
        if (isHungry()) {
            System.out.println((name + " поел"));
            plate.decreaseFood(10);
            isHungry = false;
        } else {
            System.out.println("Не голоден");
        }
    }

}
