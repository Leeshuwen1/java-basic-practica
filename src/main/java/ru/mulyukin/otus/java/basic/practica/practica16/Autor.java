package ru.mulyukin.otus.java.basic.practica.practica16;

import java.io.Serializable;

public class Autor implements Serializable {
    private long id;
    private String name;

    public Autor(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
