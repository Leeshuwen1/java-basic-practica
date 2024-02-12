package ru.mulyukin.otus.java.basic.practica.practica6;

public class CatBasket {
    private Cat cat;

    public void catIn(Cat cat) {
        if (this.cat != null) {
            System.out.println("На лежанке " + this.cat.getName());
            return;
        }
        System.out.println("Лежанку занял кот " + cat.getName());
        this.cat = cat;
    }

    public void info() {
        if (this.cat != null) {
            System.out.println("Лежанка " + cat.getName());
        } else {
            System.out.println("Лежанка пустая ");
        }
    }
}
