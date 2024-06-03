package Arraylist;

import java.util.ArrayDeque;

public class LearnArrayDequeue {
    public static void main(String[] args){
        ArrayDeque<Integer> Arg=new ArrayDeque<>();//It offere tha method same as queue
        Arg.offer(5);
        Arg.offer(6);
        Arg.offer(7);
        System.out.println(Arg);
        System.out.println(Arg.peek());
        System.out.println(Arg.peekLast());
        System.out.println(Arg.poll());

        System.out.println(Arg);
        System.out.println(Arg.pollFirst());



    }
}
