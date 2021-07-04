package com.alevel;

public class Main {

    public static void main(String[] args) {

        StringArray array1 = new StringArray("23", "test", "marina", "1", "aa");

        array1.sorting();
        System.out.println();
        array1.sortingBack();
        System.out.println();
        System.out.println(array1.numericArray());
    }
}

