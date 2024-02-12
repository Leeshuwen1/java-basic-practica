package ru.mulyukin.otus.java.basic.practica.practica6;

public class Applycation {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Plate plate1 = new Plate(100);
        Cat cat = new Cat("Tom", 2);
        Cat cat1 = new Cat("Proshka", 19);


        CatBasket catBasket = new CatBasket();
        catBasket.info();
        catBasket.catIn(cat);
        catBasket.catIn(cat1);

        cat.eat(plate);

        cat.info();
        plate.info();

        FoodPacket foodPacket = new FoodPacket(50);
        plate1.addFood(foodPacket);
        plate1.info();

    }
}
