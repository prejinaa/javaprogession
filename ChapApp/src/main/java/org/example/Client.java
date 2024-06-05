package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    Socket socket;
    BufferedReader br;
    PrintWriter out;
    public  Client(){
        try{
            System.out.println("Sending the request");
            socket=new Socket("127.0.0.1",7777);
            System.out.println("connection done");
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream());
            startReading();
            startWritting();


        }
        catch (Exception e){
            e.printStackTrace();

        }

    }
    public void startReading() {
        //creating the thread
        Runnable r1 = () -> {
            System.out.println("writer starting");
            while (true) {
                try {
                    String mess = br.readLine();
                    if (mess.equals("Exit")) {
                        System.out.println("Server terminated chat");
                        break;
                    }
                    System.out.println("server " + mess);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        };
        new Thread(r1);
    }

    public void startWritting(){
        //creating the thread
        Runnable R2=()->{
            System.out.println("writer started");
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
        new Thread(R2);

    }

    public static void main(String[] args) {
        System.out.println("this is client");
        new Client();

    }
}
