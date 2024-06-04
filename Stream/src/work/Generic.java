package work;

import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        //use of generic (we provide type safety )
        List<Integer> lists= new ArrayList<>();
        lists.add(5);
        lists.add(6);
        System.out.println(lists);
        //lists.add("string");//here it show error because we already make lists
        // object must be string typ(this show us generic


        //non generic
        List addnumber= new ArrayList<>();
        addnumber.add(5);
        addnumber.add("string");
        System.out.println(addnumber);
    }
}
