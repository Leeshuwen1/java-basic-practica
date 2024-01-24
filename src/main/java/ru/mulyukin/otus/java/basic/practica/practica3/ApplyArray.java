package ru.mulyukin.otus.java.basic.practica.practica3;


import java.util.Scanner;

public class ApplyArray {
    public static void main(String[] args) {

        quessWord();
    }

    public static void maxCountArray(int... arr) {

        /*
        1 создать счётчик
        2 прописать цик
        3 прописать условик поиска максим. числа i > max
        4 max приравниваем к массиву arr[i]
        5 вывести результат
         */
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        System.out.println(max);
        int max1 = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= max1) {
                max1 = arr[i];
            }
        }
        System.out.println(max1);
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }

        }
        System.out.println(min);

    }

    public static void quessWord() {


    /*
    1 массив создать со словами
    2 сканер для ввода слова в консоль
    3 соут с темой
    4 рандом
    5 пользователь вводит слово
    6 условие  проверяем угадали или нет
    7 цикл дающий вторую попытку
    8 добавить подсказку с буквами и звездами
     */
        String[] fruits = {"apple", "banana", "kiwi", "pineapple", "orange", "pear"};

        Scanner scanner = new Scanner(System.in); //создали сканер для работы пользователя в консоле

        int randomIndex = ((int) (Math.random() * fruits.length)); // создал рандом для генирации фруктов


        String wordToGuess = fruits[randomIndex]; //создал переменную которую приравнял к загаданному компьютером слову


        boolean win = false;
        System.out.println("Компьютер загадал фрукт "); // объяснили условия
        while (!win) {
            String wordInput = scanner.next(); //создал переменную типа Стринг которая ждёт ввод данных пользователя

            if (wordToGuess.equals(wordInput)) { //сранили угадали мы или нет
                System.out.println("Вы угадали ");
                win = true; //чтобы выйти из цикла
            }else {
                char [] toGuess = wordToGuess.toCharArray();// создали массивы символов для поиска похожих символов
                char [] input = wordInput.toCharArray();
                for (int i = 0; i < toGuess.length && i < input.length; i++) { // аналог Math.min надо взять от большего
                    if(toGuess[i] == input[i]){ //создали условие при котором сраниваются знаки char [], друг с другом
                        System.out.print(input[i]);
                    }else{
                        System.out.print("*");
                    }
                }
                for (int i = 0; i < (10 - toGuess.length) ; i++) {
                    System.out.print("*");

                }
                System.out.println();
            }
        }

    }
}
