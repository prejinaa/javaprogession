package Arraylist.HashData;

import java.util.*;
//collection class provide more functionality then collection framework

public class LearnCollectionClass {
    public static void main(String[] args){
        List<Integer>list=new ArrayList<>();
        list.add(90);
        list.add(20);
        list.add(30);
        list.add(20);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());//reverse order
        System.out.println(list);


    }
}
