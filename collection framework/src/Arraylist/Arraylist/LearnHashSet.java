package Arraylist;
//In set there is no dupllication of element in set

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnHashSet {
    public static void main (String[] args){
        Set<Integer> set=new HashSet<>();//in hashset element store in random order
        Set<Integer> set1 =new LinkedHashSet<>();//in linkset element store in the order we give
        Set<Integer> set3=new TreeSet<>();//it give sorted element in set
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(6);
        set1.add(1);
        set1.add(2);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(6);
        System.out.println(set);
        System.out.println(set1);
       // set.remove(2);
       // System.out.println(set);
      //  System.out.println(set.contains(5));
       // set.clear();
       // System.out.println(set);


    }
}
