package ru.mulyukin.otus.java.basic.practica.practica2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyPracticaApp {
    public static void main(String[] args) {


    }

    public static void fillArray() {
        // как заполнить все ячейки массива определенным значением?
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 5; // адрес ячейки и что туда кладём
            System.out.println();
        }
    }

    public static void summArray() {

        // как посчитать сумму элементов массива
        int[] arr1 = {2, 4, 5, 6, 7};
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];

        }
        System.out.println(sum);
    }

    public static void halfPastArray() {
        // заполнение правой и левой стороны массива
        int[] arr = new int[10];
        for (int i = 0; i < arr.length / 2; i++) { // заполняется левая половинаб, i=0 левая граница массива, i=arr.length правая граница массива
            arr[i] = 5;

        }
        for (int i = arr.length / 2; i < arr.length; i++) { // заполняетя правая половина
            arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void numberElementsOfArrays() {
        //как посчитать кол-во элементов массива?
        // кол-во четных чисел и сумма этих чисел
        // кол-во положительных чисел и сумма этих чисел
        int[] arr = {-3, 5, 6, 3, -1, 1, 1, 4, -3, 2, 7}; // если нужно чтото посчитать то я создаю переменную счётчик
        int evenNumberCount = 0;
        int positiveNumberCount = 0;
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                positiveNumberCount++;
                sum += arr[i];

            }
            if (arr[i] % 2 == 0) {
                evenNumberCount++;
                sum1 += arr[i];
            }
        }
        System.out.println("positiveNumberCount " + positiveNumberCount);
        System.out.println(sum);
        System.out.println("evenNumberCount " + evenNumberCount);
        System.out.println(sum1);
    }

    public static void indexArray() {
        //работа с индексами массива
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 20 - i * 5;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void nextElemetntMoreOnOne() {
        int[] arr = {1, 2, 4, 6, 2, 3, 6, 4, 2, 3, 8, 8};
        int a = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] - 1) {
                a++;
            }

        }
        System.out.println(a);
    }

    public static void nullElementArray() {
// зануление по значению
        int[] arr = {1, 2, 3, 2, 3, 4, 5, 6, 7};
        //по значению
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2 || arr[i] == 4) {
                arr[i] = 0;
            }

        }
        // по адресу
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                arr[i] = 0;
            }

        }System.out.println(Arrays.toString(arr));
    }
    public static void evenPosishion(){
        // как увеличить элементы на четных позициях на 1
        int[] arr = {1, 2, 4, 6, 2, 3, 6, 4, 2, 3, 8, 8};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0 ) {
                arr[i]++;
            }
        }System.out.println(Arrays.toString(arr));


    }
    public static void twoArrays(){
        int [] arr = {1,2,3,4,5,6,7,8};
        int [] arr1= {1,2,2,4,2,6,7,8,8,9,};
        int counter = 0;
 //       for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == arr1[i]){     // для равных массивов
//                    counter++;
//            }
        for (int i = 0; i < Integer.min(arr.length, arr1.length); i++) {// для разных массивов по длине
            if (arr[i] == arr1[i]){
                counter++;
        }

        }System.out.println(counter);
    }
}




