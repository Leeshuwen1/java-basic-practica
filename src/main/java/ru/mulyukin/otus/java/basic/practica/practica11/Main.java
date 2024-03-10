package ru.mulyukin.otus.java.basic.practica.practica11;

import java.io.*;

import static ru.mulyukin.otus.java.basic.practica.practica11.PracticaOI.toGigobait;

public class Main {
    public static void main(String[] args) {

        /*
        способы закрытиев потоков
         */
        String text = "Some Text";
        byte[] buffer = text.getBytes();

        try (FileOutputStream stream = new FileOutputStream("buffer.txt")) {
            for (byte elem : buffer) {
                stream.write(elem);
            }
        } catch (IOException e) {
            System.out.println("Input / Output error");
        }
    }

}


//        /*
//        работа с методами
//         */
//        String path = "C://WorkJava/test.txt";
//        File file = new File(path);
//
//        System.out.println("Name File " + file.getName());
//        System.out.println("Path " + ": " + file.getPath());
//        System.out.println("Absolute Path " + ": " + file.getAbsoluteFile());
//        System.out.println("Parent " + ": " + file.getParent());
//        System.out.println("Size byte " + file.length());
//
//        System.out.println("File " + (file.exists() ? "exists": "not exists"));
//        System.out.println("File " + (file.canWrite() ? "write": "does not write"));
//        System.out.println("File " + (file.canRead()? "read": "does not read"));
//        System.out.println("File " + (file.isDirectory()? "isDirectory ": "Not Directory"));
//        System.out.println("File " + (file.isFile()? "file": "not file"));
//        System.out.println("File " + (file.isHidden()? "Eap": "not Hidden"));
//
//        PracticaOI practicaOI = new PracticaOI();
//        System.out.println("File Gigabyte " + practicaOI.toGigobait(file.getTotalSpace()));
//        System.out.println("File Gigabyte " + practicaOI.toGigobait(file.getFreeSpace()));
//
//        /*
//        проверка сколько директорий и файлов в общем количестве
//         */
//        String path1 = "src/main/java/ru/mulyukin/otus/java/basic/practica/practica1";
//        File directory = new File(path);
//
//        if (directory.isDirectory()){
//            String[] content = directory.list();
//
//            if(content != null){
//                for(String elem: content){
//                    File file1 = new File(path1 + "/" + elem);
//                    System.out.println(file.isDirectory()? (elem + " is directory "): (elem + "is file"));
//                }
//            }
//        }
//
///*
//это проверка на создание пакета
// */
//        if(!directory.exists()){
//            System.out.println(directory.mkdir()? "Successfully": "Failed");
//        }else {
//            System.out.println("All ready exists");
//        }


