package Arraylist.HashData;

import java.util.TreeMap;

public class LearnTree {
    public static void main (String[] args){
        TreeMap<String,Integer>set=new TreeMap<>();
        set.put("ram",2);
        set.put("shyam",3);
        set.put("gita",4);
        set.put("hari",5);
        System.out.println(set);
        System.out.println(set.get("ram"));


    }
}
