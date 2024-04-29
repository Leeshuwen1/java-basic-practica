package ru.mulyukin.otus.java.basic.practica.practica15;

public class CompBox implements Comparable<CompBox> {
    private int size;

    public CompBox(int size) {
        this.size = size;
    }

    @Override
    public int compareTo(CompBox o) {
        return 0;
    }
}
