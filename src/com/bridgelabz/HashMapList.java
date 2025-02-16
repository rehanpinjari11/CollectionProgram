package com.bridgelabz;

import java.util.*;

public class HashMapList {

    public static void main(String[] args)
    {
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango"); //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        // Adding elements in the hash map & Traversing.

        map.putIfAbsent(5, "Orange");
        System.out.println("After invoking putIfAbsent() method ");
        for(Map.Entry m:map.entrySet()){
            System.out.println(" "+m.getValue());
        }
        System.out.println("Key"+map.get(2));

        // Removing elements in the hash map

        System.out.println("Hash list of elements: "+map);
        map.remove(2);
        System.out.println("Updated list of elements: "+map);

        // Replace elements in the Hash Map

        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        map.replace(1, "Mango", "Pinepale");
        System.out.println("After Replace list of elements: "+map);


    }
}
