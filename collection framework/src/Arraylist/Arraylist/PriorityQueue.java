package Arraylist;

import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args){
        Queue<Integer> list=new java.util.PriorityQueue<>();

        list.offer(2);//offer is used to put data in Queue
        list.offer((1));
        list.offer(3);
        //poll()method is used to extract data
        System.out.println(list);
       System.out.println(list.poll());
     System.out.println(list.peek());

    }
}
