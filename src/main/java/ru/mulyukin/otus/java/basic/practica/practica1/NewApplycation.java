package ru.mulyukin.otus.java.basic.practica.practica1;

import java.util.Scanner;

public class NewApplycation {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        while (true) {
            int difficalt;
            do {
                System.out.println("Выберите сложность:\n1) лёгкая\n2) средняя\n3) сложная");
                difficalt = scr.nextInt();
            } while (difficalt < 1 || difficalt > 3);
            int triesCount;
            int maxNumber;
            if (difficalt == 1) {
                maxNumber = 6;
                triesCount = 3;
            } else if (difficalt == 2) {
                maxNumber = 9;
                triesCount = 3;
            } else {
                maxNumber = 15;
                triesCount = 1;
            }
            int aiNumber = (int) (Math.random() * maxNumber) + 1;
            System.out.println("Игра началась, компьютер загадал число от 1  до " + maxNumber + " Количесто попыток " + triesCount);
            while (true) {
                int answer;
                do {
                    System.out.println("Введите число от 1 до " + maxNumber);
                    answer = scr.nextInt();
                } while (answer < 1 || answer > maxNumber);
                if (answer == aiNumber) {
                    System.out.println("Вы победили ");
                    break;
                }
                triesCount--;
                if (answer < aiNumber) {
                    System.out.println("Число Больше, количество попыток " + triesCount);
                } else {
                    System.out.println("Число Меньше, количество попыток " + triesCount);
                }
                if (triesCount == 0) {
                    System.out.println("Игра окончена");
                    break;
                }
            }
            System.out.println("Хотите продолжить??? ");
            String retryAnswer = scr.next();
            if (!retryAnswer.equals("y")) {
                System.out.println("Игра закончена ");
                break;
            }
        }


//
//            Scanner scanner = new Scanner(System.in); // создал сканер дял ввода в консоль пользователем
//            System.out.println("Компьютер загадал число "); // объясняю пользователю что компьютер загадал число
//            int generatedNumber = (int) ((Math.random() * 9) + 1); // объявил переменую которая выполняет рандом от 1 до 9
//            // System.out.println("Подсказка... " + generatedNumber); // подсказка какое чило загадо компьютер
//            while (true) { // добавил цикл для постоянного прокручивания цикла do while
//                int answer; // объявил переменую ансвер
//                do {  //начинаем цикл делай
//                    System.out.println("Введите число от 1 до 9 "); // предлогаю пользователю ввести число от 1 до 9
//                    answer = scanner.nextInt(); // жду от пользователя когда он введёт число
//                } while (answer < 1 || answer > 9); // пока число пользователя меньше 1 или больше 9
//                if (answer == generatedNumber) { // выполняем проверку числа пользователя с числом компьютера, если они равны
//                    System.out.println("Вы победили "); // выводим вы победили
//                    break; // останавливаю цикл в случае победы
//                } else { // в противном случае
//                    System.out.println("Вы проиграли "); // вы проиграли
//                }
//                if (answer < generatedNumber) { // Ввел подсказку больше или меньше число
//                    System.out.println("Число Больше ");
//                } else {
//                    System.out.println("Число Меньше ");
    }
}








