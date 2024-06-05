package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class OrderQueue {
    private  final int max_capacity=10;
   private final Queue<String> Q=new LinkedList<>();
   //create a synchronization function
    public synchronized  void PlaceOrder(String order) throws InterruptedException{
        while (Q.size()==max_capacity){
            wait();
        }
        Q.add(order);
        System.out.println("Order is"+order);
        notifyAll();


    }
    public synchronized String TakeOrder() throws InterruptedException{
        while(Q.isEmpty()){
            wait();
        }
        String order=Q.poll();
        System.out.println("the order is "+order);
        notifyAll();
        return order;
    }
}
