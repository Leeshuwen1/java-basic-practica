package ru.mulyukin.otus.java.basic.practica.practica10;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "One");
//        map.put(2, "Two");
//        map.put(3, "Tree");
//        map.put(4, "Foar");
        //       System.out.println(map);

//        Map<Integer, Car> map1 = new HashMap<>();
//        map1.put(1, new Car("Honda", "Golg"));
//        map1.put(2, new Car("BMW", "Black"));
//        map1.put(3, new Car("Kia", "White"));
//        System.out.println(map1);
//        System.out.println(map1.get(2));
//        System.out.println();
//        for(Map.Entry<Integer, Car> entry : map1.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//        Car car1 = new Car(1, "Honda");
//        Car car2 = new Car(2, "BMW");
//        System.out.println(car1.hashCode());
//        System.out.println(car2.hashCode());
//        System.out.println(car1.equals(car2));

//        Map<Integer, String> map1 = new HashMap<>();
//        map1.put(1, "One");
//        map1.put(2, "two");
//        map1.put(3, null);
//        map1.put(3, "Tree");
//        for (Map.Entry<Integer, String> entry: map1.entrySet()){
//            Integer key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + " " + value);
//            System.out.println(map1.containsKey(2));
//            System.out.println(map1.containsValue("foar"));
//        }
//        for(Map.Entry<Integer, String> entry: map1.entrySet()){
//            Integer key = entry.getKey();
//            String value = entry.getValue();
//            if(value.equals("One")){
//                System.out.println(key);
//                break;
//            }
//        }
//        for(Integer key: map1.keySet()){
//            System.out.println(key + " key");
//        }
//        for(String value: map1.values()){
//            System.out.println(value + " value");
//        }
        for (int i = 0; i < 4; i++) {
            map.put(i, String.valueOf(i));

        }
        System.out.println(map);
//        map.clear();
//        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.getOrDefault(2, "Yes!"));
        System.out.println(map.size());

        Map<Integer, String> map1 = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map1.put(i, String.valueOf(i));

        }
        System.out.println(map1 + " map1");
        map.putAll(map1);
        System.out.println(map + " map");
        map.remove(3);
        System.out.println(map);
        map.remove(1, "1");
        System.out.println(map);
        for (String valur : map.values()) {
            System.out.println(valur);
        }
        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(1, "One");
        System.out.println(linkedMap);
        linkedMap.clear();
        System.out.println(linkedMap);

        Iterator<Map.Entry<Integer, String>> iterator = linkedMap.entrySet().iterator();
        for (int i = 0; i < 5; i++) {
            linkedMap.put(i, String.valueOf(i));
            System.out.println(linkedMap);
        }
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        Iterator iterator1 = linkedMap.keySet().iterator();
        while (iterator1.hasNext()){
            System.out.println("Key " + iterator1.next());
        }

        Iterator iterator2 = linkedMap.values().iterator();
        while (iterator2.hasNext()){
            System.out.println("value " + iterator2.next());
        }
        for(Map.Entry<Integer, String> entry: linkedMap.entrySet()){
            System.out.println("Key " + entry.getKey() + " value " + entry.getValue());
        }
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Pen");
        hashSet.add("Book");
        System.out.println(hashSet);
        System.out.println(hashSet.size());

        Iterator iter = hashSet.iterator();
        while (iter.hasNext()){
            System.out.println("value " + iter.next());
        }
        for (String str: hashSet){
            System.out.println(str);
        }
        System.out.println("remove " + hashSet.remove("Pen"));
        System.out.println(hashSet.size());
        hashSet.clear();
        System.out.println(hashSet.isEmpty());

    }

}
