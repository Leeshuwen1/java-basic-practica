package ru.mulyukin.otus.java.basic.practica.practica3;

public class BackPack {
    String[] content = new String[5];

    void put(String item) {
        for (int i = 0; i < content.length; i++) {
            if (content[i] == null) {
                System.out.println("Put " + item);
                content[i] = item;
                return;
            }
        }
    }

    int size() {
        int count = 0;
        for (int i = 0; i < content.length; i++) {
            if (content[i] != null) {
                count++;
            }
        }
        return count;
    }
    void print(){
        for (int i = 0; i < content.length; i++) {
            if(content[i] != null){
                System.out.print('[' + content[i] + " ");
            }
        }
        System.out.println(']');
    }
    String get(String item){
        for (int i = 0; i < content.length; i++) {
           if(item.equals(content[i])){
               content[i] = null;
               System.out.println("Got item ");
               return item;
            }
        }
        return null;
    }
}

