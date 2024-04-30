package ru.mulyukin.otus.java.basic.practica.practica16;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String > comments = new ArrayList<>();
        comments.add("comment * 1");
        comments.add("comment * 2");
        Book book = new Book(1, "book's name", new Autor(1, "author's name"), comments);
        System.out.println(book);


// сериализация book - book.ser
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("book.ser"))) {
            objectOutputStream.writeObject(book);
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
 //сериализация book.ser - book

        Book book1 = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("book.ser"))) {
            book1 = (Book) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error " + e.getMessage());
        }

        System.out.println(book1);



//        try (RandomAccessFile randomAccessFile = new RandomAccessFile("2.txt", "rw")) {
//            randomAccessFile.seek(randomAccessFile.length());
//            randomAccessFile.skipBytes(11);
//            randomAccessFile.write(69);
//        } catch (IOException e) {
//            System.out.println("Error " + e.getMessage());
//        }


//        try(PrintWriter printWriter = new PrintWriter("2-3.txt")){
//            String str = "Rjksirb";
//            String str1 = "jdbckasjbfkjsbfjksnfls";
//            printWriter.println(str);
//            printWriter.println(str1);
//        }catch (Exception e){
//            System.out.println("Error " + e.getMessage());
//        }


//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("2-2.txt"))) {
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println("Error " + e.getMessage());
//        }


//        try(BufferedOutputStream bufferedInputStream = new BufferedOutputStream(new FileOutputStream("2-2.txt"))){
//            String str = "Убушки воробушкаи, Hello bitch";
//            bufferedInputStream.write(str.getBytes(StandardCharsets.UTF_8));
//        }catch (IOException e){
//            System.out.println("Error " + e.getMessage());
//        }


//        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("2.txt"))) {
//            byte[] bytes = bufferedInputStream.readAllBytes();
//            String data = new String(bytes, StandardCharsets.UTF_8);
//            System.out.print(data);
//
//        } catch (IOException e) {
//            System.out.println("Error " + e.getMessage());
//        }

//        try (FileOutputStream outputStream = new FileOutputStream("2.txt")) {
//            String str = "hello world, привет мир";
//            outputStream.write(str.getBytes(StandardCharsets.UTF_8));
//        } catch (IOException e) {
//            System.out.println("Error " + e.getMessage());
//        }


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


