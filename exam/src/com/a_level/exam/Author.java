package com.a_level.exam;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private String sureName;
    private List<Book> allBooks;

    public Author() {
        this.allBooks = new ArrayList<>();
    }

    public Author(String name, String sureName) {
        this();
        this.name = name;
        this.sureName = sureName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getSureName() {
        return sureName;
    }

    public List<Book> getBooks() {
        return allBooks;
    }

    public String toString() {
        return "Имя автора: " + name + ", фамилия: " + sureName;
    }


}
