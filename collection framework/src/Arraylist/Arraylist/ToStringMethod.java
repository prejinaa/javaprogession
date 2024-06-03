package Arraylist;// Java program to demonstrate
// AbstractMap.SimpleEntry.toString() method

import java.util.*;

public class ToStringMethod {

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args)
    {

        // create a ArrayList of Map
        ArrayList<AbstractMap
                .SimpleEntry<String, String> >
                arrayList
                = new ArrayList<AbstractMap
                .SimpleEntry<String, String> >();

        // add values
        arrayList.add(new AbstractMap
                .SimpleEntry(" 001AB ", " Emp 1"));
        arrayList.add(new AbstractMap
                .SimpleEntry(" 011AC ", " Emp 2"));
        arrayList.add(new AbstractMap
                .SimpleEntry(" 111AD ", " Emp 3"));
        arrayList.add(new AbstractMap
                .SimpleEntry(" 101BE ", " Emp 4"));
        arrayList.add(new AbstractMap
                .SimpleEntry(" 110CE ", " Emp 5"));

        // print keys
        for (int i = 0; i < arrayList.size(); i++) {

            // get map from list
            AbstractMap.SimpleEntry<String, String>
                    map
                    = arrayList.get(i);

            // get representation of map using toString()
            String value = map.toString();

            System.out.println(value);
        }
    }
}

