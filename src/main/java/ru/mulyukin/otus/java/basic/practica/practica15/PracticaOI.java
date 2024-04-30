package ru.mulyukin.otus.java.basic.practica.practica15;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PracticaOI {
    public static void main(String[] args) {

        try(FileOutputStream outputStream = new FileOutputStream("2.txt")){
            String str = "hello world";
            for(char ch: str.toCharArray()){
                outputStream.write(ch);
            }

        }catch (IOException e){
            System.out.println("Error " + e.getMessage());
        }


//        try (FileInputStream fileInputStream = new FileInputStream("1.txt")) {
//            byte[] buffer = new byte[1024];
//            int len;
//            while ((len = fileInputStream.read(buffer)) != -1) {
//                String data = new String(buffer, 0, len, StandardCharsets.UTF_8);
//                System.out.println(data);
//            }
//        } catch (IOException e) {
//            System.out.println("Error " + e.getMessage());
//        }

//        try (FileReader fileReader = new FileReader("1.txt", StandardCharsets.UTF_8)) {
//            int byteRead;
//            while ((byteRead = fileReader.read()) != -1) {
//                System.out.print((char) byteRead);
//            }
//        } catch (IOException e) {
//            System.out.println("Error " + e.getMessage());
//        }


    }
}
