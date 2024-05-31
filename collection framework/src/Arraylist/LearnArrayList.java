package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class LearnArrayList {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println(list);
        list.add(9);
        System.out.println(list);
//        list.add(0,3);
//        System.out.println(list);
//        List<Integer>NewlList=new ArrayList<>();//adding a new list in old list
//        NewlList.add(5);
//        NewlList.add(6);
//        NewlList.add(7);
//        list.addAll(NewlList);
//        System.out.println(list);
//        System.out.println(list.get(0));
//        //In list there are method we can use that are add, remove,update,set
//        //to add we use add(), to remove we use remove(),to update we use set()
//        list.remove(1);
//        System.out.println(list);
//        System.out.println(list.contains(5));
//

        int i;
        for(i=0; i<list.size(); i++){
       System.out.println("the element  is"+list.get(i));
       // this is also way to iterate the element
            Iterator<Integer>it= list.iterator();
            while (it.hasNext()){
                System.out.println("Iterator"+it.next());
            }


         }

    }
}

