package ru.mulyukin.otus.java.basic.practica.practica6;

public class FoodPacket {
    private int food;

    public int getFood() {
        return food;
    }

    public FoodPacket(int food) {
        this.food = food;
    }

    public void clear(){
        food = 0;
    }
}
