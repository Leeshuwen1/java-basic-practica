package ru.mulyukin.otus.java.basic.practica.practica14;

public class ManyMain extends  Thread{
    @Override
   public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.print(i);

        }
   }
}
