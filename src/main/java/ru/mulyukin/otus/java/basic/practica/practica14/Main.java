package ru.mulyukin.otus.java.basic.practica.practica14;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ManyMain manyMain = new ManyMain();

        Thread thread = new Thread(new MyTask());

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.print(i);
                }
            }
        });
        thread1.start();
        thread1.join();

        thread.start();
        thread.join();

        manyMain.start();
        manyMain.join();

        System.out.println();
        System.out.println("END");
    }
}
