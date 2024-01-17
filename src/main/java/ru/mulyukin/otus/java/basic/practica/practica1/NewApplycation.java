package ru.mulyukin.otus.java.basic.practica.practica1;

import java.util.Scanner;

public class NewApplycation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Компьютер загадал число ");
        int generatedNumber = (int) ((Math.random() * 9) + 1);
        System.out.println("Подсказка... " + generatedNumber);
        int answer;
        do {
            System.out.println("Введите число от 1 до 9 ");
            answer = scanner.nextInt();
        } while (answer < 1 || answer > 9);
        if (answer == generatedNumber) {
            System.out.println("Вы победили ");
        } else {
            System.out.println("Вы проиграли ");
        }
    }
}



