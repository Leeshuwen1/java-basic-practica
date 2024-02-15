package ru.mulyukin.otus.java.basic.practica.practica7;

import ru.mulyukin.otus.java.basic.practica.DayOfTheWeak;

public class Main {
    public static void main(String[] args) {
//        Day day = new Day(2);
//        Day day1 = new Day(2);
//        System.out.println(day.equals(day1));

//        DayOfTheWeak day = DayOfTheWeak.MON;
//        DayOfTheWeak day1 = DayOfTheWeak.valueOf("SAT");
//        System.out.println(day1 + " " + day1.getDayNumber());

        Cat cat = new Cat("Tom", "white");
        Hedgehog hedgehog = new Hedgehog(10);
        Robot robot = new Robot(3698);
        Man man = new Man("Ivan");

        Competition competition = new Competition(3000);
        competition.runAll(new Runner[] {cat, hedgehog, man });
        robot.fly();
    }
}
