package com.bridgelabz;

import java.util.*;

class Book_Main {

    int id;
    String name,author,publisher;
    int quantity;

    public Book_Main(int id, String name, String author, String publisher, int quantity)
    {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class MapExample {

    public static void main(String[] args)
    {
//Creating map of Books
        Map<Integer, Book_Main> map=new HashMap<Integer, Book_Main>();
//Creating Books
        Book_Main b1=new Book_Main(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book_Main b2=new Book_Main(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book_Main b3=new Book_Main(103,"Operating System","Galvin","Wiley",6);
//Adding Books to map
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);

//Traversing map
        for(Map.Entry<Integer, Book_Main> entry:map.entrySet()){
            int key=entry.getKey();
            Book_Main b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
