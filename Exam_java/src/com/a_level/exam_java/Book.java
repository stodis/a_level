package com.a_level.exam_java;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String name;
    private List<Author> allAuthors;

    public Book() {
        this.allAuthors = new ArrayList<>();
    }

    public Book(String name) {
        this();
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Author> getAuthors() {
        return allAuthors;
    }

    public String toString() {
        return "Название книги: " + name;
    }

}
