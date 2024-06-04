package work;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //collection object
        List<Integer>st1=new ArrayList<>();
     st1.add(1);
     st1.add(2);
     st1.add(3);
     st1.add(5);
     Stream<Integer> newst1=st1.stream();
     newst1.forEach(System.out::println);
//using the string method filter(here we use boolean expression)
        // list the name which is start with "D"
        List<String> name= List.of("premain","Gemfire","Dishy","Sharma");
        List<String>newname1= name.stream().filter(e->e.startsWith("D")).collect(Collectors.toList());
        //function reference print
        for (String s : name) {
            System.out.println(s);
        }
        System.out.println(newname1);
        //multiply the element by square
        List<Integer>name3= List.of(10,30,80,2,3,4,5,6);
        List<Integer>name4=name3.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(name4);
        name3.stream().sorted().forEach(System.out::println);
        //sort
        Integer inter =name3.stream().min((x,y)->x.compareTo(y)).get();//mini
        Integer inter1 =name3.stream().max((x,y)->x.compareTo(y)).get();

        System.out.println(inter);
        System.out.println(inter1);





    }
}
