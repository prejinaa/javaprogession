package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class Server {
    ServerSocket server;
    Socket socket;
     BufferedReader br;
     PrintWriter out;


    public Server() {
        try {
            server = new ServerSocket(7777);
            System.out.println(" server is ready to accept connection");
            System.out.println(" waiting....");
            socket = server.accept();
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream());
            startReading();
            startWritting();


        } catch (Exception e) {
            e.printStackTrace()
            ;
        }
    }
        public void startReading() {
            //creating the thread
            Runnable r1 = () -> {
                System.out.println("reading is starting");
                while (true) {
                    try {
                        String mess = br.readLine();
                        if (mess.equals("Exit")) {
                            System.out.println("client terminated chat");
                            break;
                        }
                        System.out.println("Client " + mess);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }

            };
            new Thread(r1).start();

        }

       public void startWritting(){
            //creating the thread
        Runnable R2=()->{
            while(true){
                try{
                    BufferedReader brs= new BufferedReader(new InputStreamReader(System.in));
                    String content= brs.readLine();
                    out.println(content);
                    out.flush();

                }
                catch (Exception e){
                    e.printStackTrace();

                }

            }

        };
        new Thread(R2).start();

        }


    public static void main(String[] args) {
        System.out.println("The is a server.going to start sever.....");
        new Server();//we make server constructor object

    }
}
