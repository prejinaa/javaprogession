package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        //create a list and filter an even number
        //without stream
       List<Integer> lists= Arrays.asList(2,3,4,5,6,7);
       List<Integer>lists1=new ArrayList<>();
       for(Integer i:lists){
           if(i%2==0){
               lists1.add(i);
           }
       }

        System.out.println(lists);
        System.out.println(lists1);
       //stream
        //using steam api we can write a code in short way
        Stream<Integer> stream =lists.stream();
        //in filter method we pass predicate //do lambda expression
        //here using stream we can make code more short
       List<Integer>newlist= stream.filter(i->i%2==0).collect(Collectors.toList());//here collector use to list method and collect the element in newlist
        List<Integer> listss =lists.stream().filter(i->i > 5).collect(Collectors.toList());
        System.out.println(listss);
        System.out.println(newlist);



    }


}
