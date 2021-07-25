package com.a_level.exam_java;

import java.util.List;

public class AuthorServiceImpl implements AuthorService{
    @Override
    public List<Book> getBooksByAuthor(Author author) {
        return author.getBooks();
    }
}
