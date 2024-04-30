package ru.mulyukin.otus.java.basic.practica.practica15;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class PracticaOI {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("1.txt", StandardCharsets.UTF_8)) {
            int byteRead;
            while ((byteRead = fileReader.read()) != -1) {
                System.out.print((char) byteRead);
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }


    }
}
