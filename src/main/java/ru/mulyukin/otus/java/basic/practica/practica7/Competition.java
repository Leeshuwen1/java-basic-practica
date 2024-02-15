package ru.mulyukin.otus.java.basic.practica.practica7;

public class Competition {

    private int distance;

    public Competition(int distance) {
        this.distance = distance;
    }


    public void runAll(Runner[] competitors) {
        for (Runner competitor : competitors) {
            competitor.run(distance);


        }

    }
}

