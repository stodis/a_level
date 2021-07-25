package com.a_level.exam;

import java.util.List;

public class AuthorServiceImpl implements AuthorService{
    @Override
    public List<Book> getBooksByAuthor(Author author) {
        return author.getBooks();
    }


}
