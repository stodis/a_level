package com.a_level.Lesson12;

import java.util.HashMap;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(7, "mura");
        HashMap<Integer, Cat> cat1 = new HashMap<>();
        cat1.put(1, new Cat(3, "Mura"));
        cat1.put(2, new Cat(6, "Fifa"));
        cat.hashCode();
        cat.equals(cat);
        System.out.println(cat1.entrySet());
        System.out.println(cat1.toString());
        System.out.println(cat1.hashCode());
        for (Integer key : cat1.keySet()) {
            System.out.println("Key: " + key);
        }
        for (Cat value : cat1.values()) {
            System.out.println("Value: " + value );
        }
    }



}
