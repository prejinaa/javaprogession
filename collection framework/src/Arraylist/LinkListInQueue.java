package Arraylist;

import java.util.LinkedList;
import java.util.Queue;

public class LinkListInQueue {
    public static void main(String[] args){
        Queue<Integer>list=new LinkedList<>();
        list.offer(1);//offer is used to put data in Queue
        list.offer((2));
        list.offer(3);
        //poll()method is used to extract data
        System.out.println(list);
       System.out.println(list.poll());
        System.out.println(list);
        System.out.println(list.peek());


    }
}
