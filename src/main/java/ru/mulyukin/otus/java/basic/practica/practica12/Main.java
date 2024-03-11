package ru.mulyukin.otus.java.basic.practica.practica12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        Scanner in = new Scanner(file);
        while ((in.hasNext())) {
            String s = in.next();
            System.out.println(s);
        }
        in.close();

        try (FileInputStream input = new FileInputStream("file.txt")) {
            int n = input.read();
            while (n != -1) {
                System.out.print((char) n);
                n = input.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream in1 = new FileInputStream("file.txt")) {
            byte[] buf = new byte[64];
            int n = in1.read(buf);
            while (n > 0) {
                System.out.print(new String(buf, 0, n));
                n = in1.read(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedInputStream in2 = new BufferedInputStream(new FileInputStream("file.txt"))) {
            int n = in2.read();
            while (n != -1) {
                System.out.print((char)n);
                n = in2.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStreamReader in3 = new InputStreamReader(new FileInputStream("file.txt"))) {
            int n = in3.read();
            while (n != -1) {
                System.out.print((char)n);
                n = in3.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String data = "Маза Фака";
        try (FileOutputStream out = new FileOutputStream("file.txt")) {
            byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String data1 = "Hello World";
        try (FileOutputStream out = new FileOutputStream("out1.txt")) {
            byte[] buffer = data1.getBytes(StandardCharsets.UTF_8);
            out.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String data3 = "Hello World1111";
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("file.txt"))) {
            byte[] buffer = data3.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader reader = null;
        try {
            File file1 = new File("file1.txt");
            if (!file1.exists()) {
                file1.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(file1);
            printWriter.println("What's up, BROOOO!!!!");
            printWriter.println("It's all rite!!!");
            printWriter.println("Heyyy, it's cool, BRO!!!");
            printWriter.close();

            reader = new BufferedReader(new FileReader("file1.txt"));
            String line = reader.readLine();
            while (line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error " + e);
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Error " + e);
            }
        }
    }

}
