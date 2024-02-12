package ru.mulyukin.otus.java.basic.practica.practica6;

public class Plate {
    private int food;



    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount){
        food -= amount;
    }

    public void addFood(FoodPacket foodPacket){
        food += foodPacket.getFood();
        foodPacket.clear();
    }

    public void info() {
        System.out.println("Plate " + food);
    }
}
