package ru.mulyukin.otus.java.basic.practica.practica15;

import java.util.*;

public class Applycation {
    public static void main(String[] args) {
//        Box box1 = new Box(10);
//        Box box2 = new Box(20);
//
//        box1.setObj("java");
//
//        if (box1.getObj() instanceof Integer && box2.getObj() instanceof Integer) {
//            int result = (Integer) box1.getObj() + (Integer) box2.getObj();
//            System.out.println(result);
//        }
//        BoxGen<Integer> bg1 = new BoxGen<>(10);
//        BoxGen<Integer> bg2 = new BoxGen<>(20);
//        int result = bg2.getObj() + bg1.getObj();
//        System.out.println(result);
//
//        BoxGen<String > bg3 = new BoxGen<>("Java");
//        System.out.println(bg3.getObj());
//
//        BoxToGen<String , Integer > boxToGen = new BoxToGen<>("Java", "Hello", 10);
//        BoxGen<Integer> b1 = new BoxGen<>(10);
//        System.out.println(b1.getClass().getSimpleName());

//        List<Number> list1 = new ArrayList<>(Arrays.asList(1, 2, 3f, 4.0));
//        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Integer a = first((new ArrayList<Integer>(Arrays.asList(1,2,7,4))));
        System.out.println(a);

//        List<? super T> objects = BoxGen<Integer>;
//        Collections.copy(objects);
    }

    public static double listAvg(List<? extends Number> numbers) {
        double out = 0.0;
        for (int i = 0; i < numbers.size(); i++) {
            out += numbers.get(i).doubleValue();
        }
        return out / numbers.size();

    }
    public static <T> T first(List<T> in){
        return in.get(0);
    }
}
