package com.alevel;

public class StringArray {

    String[] arrays;

    StringArray(String... arrays) {
        this.arrays = arrays;
    }

    public void sorting() {
        String s;
        for (int i = 0; i < this.arrays.length - 1; i++)
            for (int j = i; j >= 0; j--)
                if (this.arrays[j].compareTo(this.arrays[j + 1]) > 0) {
                    //поменять местами this.arrays[j] и this.arrays[j+1]
                    s = this.arrays[j];
                    this.arrays[j] = this.arrays[j + 1];
                    this.arrays[j + 1] = s;
                }
        for (int i = 0; i < this.arrays.length; i++) // вывод исходного массива
            System.out.println(this.arrays[i]);

    }

    void sortingBack() {

        String s;
        for (int i = 0; i < arrays.length - 1; i++)
            for (int j = i; j >= 0; j--)
                if (this.arrays[j].compareTo(arrays[j + 1]) < 0) {
                    //поменять местами this.arrays[j] и this.arrays[j+1]
                    s = this.arrays[j];
                    this.arrays[j] = arrays[j + 1];
                    this.arrays[j + 1] = s;
                }
        for (int i = 0; i < this.arrays.length; i++)
            System.out.println(this.arrays[i]); // вывод исходного массива
    }

    String numericArray() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arrays.length; i++) {
            builder.append(i + 1).append(":").append(arrays[i]).append(" ");
        }
        return builder.toString();


    }
}