package Arraylist;

import java.util.HashMap;

public class LearnHashMap {
    public static void main(String[] args){
        //Hashmap
        HashMap<String,Integer> map = new HashMap<>();
        HashMap<Integer,String> map1=new HashMap<>();
        map.put("mini",2);
        map.put("riya",3);
        map.put("shyam",8);
        map.put("gita",9);
        map.put("Dikshya",3);//hash map allow duplication value but not key

        //get the size of element
        System.out.println(map.size());

        System.out.println(map);
        //removing the element from hashmap
        map.remove("shyam");
        System.out.println(map);
        //remove the key and element from hashmap table
        map.clear();
        System.out.println("the hash map contain "+map);

        if(map.containsKey("mini")){//check if key is present in hashmap if then print the element present on it
            Integer a=map.get("mini");
            System.out.println("the value of mini is"+a);



        }
        System.out.println(map.containsKey("splashy"));//check key is present in hash map or not
        //clone() is used to create copy of hashmap

        map1.put(2,"mini");
        map1.put(3,"riyaz");
        map1.put(4,"shyam");
        map1.put(5,"Gita");
        map1.put(7,"sita");
        for(Integer key:map1.keySet())//iterator for key project
            System.out.println(key);
        for(String values:map1.values())
            System.out.println(values);



        System.out.println("the element present hasmap "+map1);
        map1.computeIfPresent(2,(key, val)->val.concat("shah"));//here we check  the key and compute the string
        System.out.println(map1);
       // map1.clone();
      //  System.out.println("the colne element in hashmap are00"+map1);
        //entryset()
        System.out.println("the set is"+map1.entrySet());




    }
}
