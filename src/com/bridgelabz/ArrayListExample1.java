package com.bridgelabz;

import java.util.*;

public class ArrayListExample1 {

    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");


// Traversing Using Iterator
        Iterator itr=al.iterator();//getting the Iterator

        while(itr.hasNext())
        {//check if iterator has the elements
            System.out.println(itr.next());//printing the element and move to next
        }
        System.out.println("Replacing the element------");

//accessing the element
        System.out.println("Returning element: "+al.get(1));//it will return the 2nd element, because index starts from 0
//changing the element
        al.set(3,"Dates");

//al.remove(3);

//Traversing list through For Loop
        for(String fruit:al)
            System.out.println(fruit);
        System.out.println("Deleting the element");


        al.remove(3);
        for(String fruit:al)
            System.out.println(fruit);

    }

}
