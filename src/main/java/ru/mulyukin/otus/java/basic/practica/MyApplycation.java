package ru.mulyukin.otus.java.basic.practica;

import java.util.Arrays;
import java.util.Scanner;

public class MyApplycation {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsic", "White", 4);

        cat1.run();
        cat1.jump();
        cat1.info();
        System.out.println(cat1.getName());
        cat1.setAge(3);
        System.out.println(cat1.getAge());

        Cat cat2 = new Cat("Murzic", "Black", 3);

        cat2.run();
        cat2.jump();
        cat2.info();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведлите новое имя кота");
        String newName = scanner.next();
        cat1.setName(newName);
        cat1.info();

        cat2 = cat1;
        cat1.setColor("Green");
        cat2.setColor("Purpol");
        cat1.info();
        cat2.info();

        Cat[] cats = new Cat[3]; // также можно заполнить короткой формой {}
        cats[0] = new Cat("A", "a", 10);
        cats[1] = new Cat("B", "b", 10);
        cats[2] = new Cat("C", "c", 10);
        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
        }

    }
}
