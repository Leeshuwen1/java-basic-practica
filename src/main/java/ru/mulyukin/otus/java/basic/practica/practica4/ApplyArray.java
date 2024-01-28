package ru.mulyukin.otus.java.basic.practica.practica4;

public class ApplyArray {
    public static void main(String[] args) {

        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 0;
            }

        }
        draw(arr);
        printArray(arr);

    }
    private static void draw(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if (i == j || i + j == arr.length - 1 || i == 5 || j == 5){
                   arr[i][j] = 1;
               }
            }
        }
    }
    public static int findOfMinCount(int[][] arr, int number) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < number) {
                    count++;
                }
            }

        }
        return count;
    }

    public static int sumArray(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

        }
        return sum;
    }


//        int sqr1 = squer(1);
//        int sqr2 = squer(3);
//        int sqr3 = squer(4);
//
//        System.out.println(sqr1 + sqr2 + sqr3);
//        System.out.println(getLength("Bazuka"));
//        System.out.println(sumString("Otus", "Basic"));


    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void clock() {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    System.out.println(i + ":" + j + ":" + k);
                }
            }
        }
    }

    public static int squer(int length) {
        int result = length * length;
        return result;
    }

    public static int getLength(String str) {
        return str.length();
    }

    public static String sumString(String str1, String str2) {
        return str1 + str2;
    }
}
