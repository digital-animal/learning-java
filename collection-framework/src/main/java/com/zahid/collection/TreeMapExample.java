package com.zahid.collection;

import java.util.Map;
import java.util.TreeMap;

import com.zahid.collection.person.Person;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Person, String> phoneBook = new TreeMap<>(); // ordered according to compareTo

        phoneBook.put(new Person("Alex", 30), "492357816");
        phoneBook.put(new Person("Lee", 28), "123456789");
        phoneBook.put(new Person("Cooper", 25), "987654321");
        phoneBook.put(new Person("Alex", 30), "492357816"); // equals() and hashCode() overrided by lombok
        phoneBook.put(new Person("zahid", 29), "123357816"); // equals() and hashCode() overrided by lombok

        System.out.println(phoneBook);
        System.out.println(phoneBook.keySet());
        System.out.println(phoneBook.values());
        System.out.println(phoneBook.entrySet());
        System.out.println();

        for(Map.Entry<Person, String> entry: phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println();
    }
}
