package ru.mulyukin.otus.java.basic.practica.practica14;

public class MyAppRace {
    private static Object o = new Object();
    private  static  int x = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    synchronized (o){
                        x++;
                    }
                }
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    inc();
                    }
                }
        });

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();


        System.out.println(x);

    }
    private static synchronized void inc(){
        x++;
    }
}
