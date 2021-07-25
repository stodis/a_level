package com.a_level.exam;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService{

    private List<Book> bookList = new ArrayList<>();

    @Override
    public void create(Book book) {
        bookList.add(book);
    }

    @Override
    public Book read(Book book) {
        return bookList.get(bookList.indexOf(book));
    }

    @Override
    public void update(Book oldBook, Book newBook) {
        int bookIndex = bookList.indexOf(oldBook);
        bookList.set(bookIndex, newBook);
    }

    @Override
    public void delete(Book book) {
        bookList.remove(book);
    }

    @Override
    public List<Author> getAuthors(Book book) {
        return book.getAuthors();
    }

}
