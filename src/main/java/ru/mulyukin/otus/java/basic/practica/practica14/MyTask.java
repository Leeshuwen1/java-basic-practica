package ru.mulyukin.otus.java.basic.practica.practica14;

public class MyTask implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.print(i);

        }
    }
}
