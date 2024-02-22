package ru.mulyukin.otus.java.basic.practica.practica9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String [] stringArray = new String[5];
//        //stringArray[5] = "плюс 1"; вышли за пределы массива
//        Arrays.fill(stringArray,"Test");
//        //вывод
//        printArray(stringArray);
//        //избавиться от какого то элемента
//        stringArray[3] = null;
//        printArray(stringArray);
// увеличение массива в 2 раза, но это не удобно есть коллекции
        int[] arr = {1,2,3,4};
        int[] extendedArray = new int[arr.length * 2];
        System.arraycopy(arr,0,extendedArray,0,arr.length);
        arr = extendedArray;
        printArray(arr);
    }

    private static void printArray(int[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + " ");
        }
        System.out.println();
    }
}
