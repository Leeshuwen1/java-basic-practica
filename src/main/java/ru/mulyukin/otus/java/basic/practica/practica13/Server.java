package ru.mulyukin.otus.java.basic.practica.practica13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private static final List<ClientHandler> clientHandlers = new ArrayList<>() ;
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8080);
        while (true) {
            Socket clientSocket = socket.accept(); //информация по подключению клиента
            DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream()); //принимает от клиентского приложения
            DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());// отправляем обратно в клиентское приложение
            ClientHandler clientHandler = new ClientHandler(clientSocket, inputStream, outputStream);
            clientHandlers.add(clientHandler);
            String userInput = inputStream.readUTF();//получили от клиента строчку
            String result = transform(userInput);//преобразовали ей в верхний регистр
            outputStream.writeUTF(result);//отправили ее обратно клиенту
            outputStream.flush();//протолкнули все пакеты на всякий случай
        }

    }

    public static String transform(String string) { //бизнес логика
        return string.toUpperCase();
    }
}
