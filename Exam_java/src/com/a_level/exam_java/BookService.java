package com.a_level.exam_java;

import java.util.List;

public interface BookService {
    void create(Book book);

    Book read(Book book);

    void update(Book oldBook, Book newBook);

    void delete(Book book);

    List<Author> getAuthors(Book book);
}





