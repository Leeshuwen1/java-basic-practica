package ru.mulyukin.otus.java.basic.practica.practica9;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        //инициалия коллекции и заполнение ее, разные варианты
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Test");
        stringArrayList.add("Test");
        stringArrayList.add("Test");
        stringArrayList.add("Test");
        for (int i = 0; i < 10; i++) {
            stringArrayList.add("Test");
        }
        stringArrayList.add(1, "ABC");
        stringArrayList.set(1, "CBA"); //замена по индексу. Заменили АВС на СВА
        System.out.println(stringArrayList);
        System.out.println(stringArrayList.get(1));

        for (String elem : stringArrayList) {
            System.out.print(elem);
        }
        System.out.println(stringArrayList);
        // вариант заполнения коллекции
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            list.add("Л");
        }
        for (int i = 0; i < 5; i++) {
            list.add("О");
        }
        for (int i = 0; i < 1; i++) {
            list.add("Х");
        }
        System.out.println(list);

        // метод remove и заполнение
        ArrayList<Integer> integerArrayList = new ArrayList<>(
                Arrays.asList(1, 2, 3, 5, -3, -1, 2, -5));
        System.out.println(integerArrayList);
        for (int i = 0; i < integerArrayList.size(); i++) {
            if (integerArrayList.get(i) < 0) {
                integerArrayList.remove(i); //(Integer.valueOf(4) или (Integer)4) это по объекту
                i--;// это шаг возвращяет итеррацию на шаг назад, для убирание сдвига коллекции
                // или идти в цикле с обратной стороны
            }
        }
        System.out.println(integerArrayList);
        //метод удаления и безопасность
        Iterator<Integer> iter = integerArrayList.iterator();//чтобы сработало, надо брать итератор
        while (iter.hasNext()) {
            Integer chislo = iter.next();
            if (chislo < 0) {
                iter.remove();
            }
        }
        System.out.println(integerArrayList);


        //для удаления не годится
//        for (Integer elem : integerArrayList) {//это не сработает потому что внутренний счетчик конфликтует со значениями нашего массива
//            if(elem < 0){
//                integerArrayList.remove(elem);
//            }
//        }
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>(arrayList);
        linkedList.add("Hello");
        linkedList.add("Hello");
        linkedList.add("Hello");
        System.out.println(linkedList.get(1));
        System.out.println(linkedList);

        // итератор + СoncurrentModificationException
        List<String> arrayList1 = new ArrayList<>(Arrays.asList("A", "AAA", "AA", "AAAA", "A"));
        for (String s: arrayList1) {
            if(s.length() < 2) {
                list.remove(s);
            }
        }System.out.println(arrayList1);
//проверить на вставку
        int n = 100000;
        List<Integer> array = new ArrayList<>();
        List<Integer> linked = new LinkedList<>();
        long startTimeArrayList = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            array.add(0, i);
        }
        long endTimeArrayList = System.currentTimeMillis();
        System.out.println("Время исполнения эрей = " + (endTimeArrayList - startTimeArrayList));

        long startTimeLinkedList = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            linked.add(0, i);
        }
        long endTimeLinkedList = System.currentTimeMillis();
        System.out.println("Время исполнения линкед = " + (endTimeLinkedList - startTimeLinkedList));

Student student = new Student("Bob", Arrays.asList(5, 5, 5, 3, 4));

    }
}
