package com.cbfacademy;

import java.io.*;
import java.net.*;

public class ExerciseServer {
    public static void main(String[] args) {

        // create a 'ServerSocket' object that listens for client connections on port 4040.
        // 'try' statment ensures the 'ServerSocket' is closed automatically when the try block is exited. 
        try (ServerSocket serverSocket = new ServerSocket(4040)) {
            System.out.println("Server is listening on port 4040...");

        // loop to continusly accept client connections    
            while (true) {

         // waits for client connection and acceps it, creating 'Socket' object ('clientSocket') 
         // to handle the connection.       
                try (Socket clientSocket = serverSocket.accept();

        // Creates a 'BufferedReader' object ('in') to read input from client.
        // it wraps an 'InputStreamReader' around the 'clientSocket''s input stream.
                     BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
           
        // reads a line of text sent by the client. 
                     String message = in.readLine();

                    System.out.println("Received message from client: " + message);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


    
    

