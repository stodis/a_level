package com.a_level.exam_java;

import java.util.Iterator;

public class BookLibrary {
    public static void main(String[] args) {
        Book b1 = new Book("Книга Джунглей");
        Book b2 = new Book("Люди Икс");

        Author a1 = new Author("name1", "sureName1");
        Author a2 = new Author("name2", "sureName2");
        Author a3 = new Author("name3", "sureName3");
        Author a4 = new Author("name4", "sureName4");
        Author a5 = new Author("name5", "sureName5");
        Author a6 = new Author("name6", "sureName6");

        // Книгу Джунглей писали 3 автора
        b1.getAuthors().add(a1);
        b1.getAuthors().add(a2);
        b1.getAuthors().add(a6);

        a1.getBooks().add(b1);
        a2.getBooks().add(b1);
        a6.getBooks().add(b1);

        // Книгу Люди Икс писали 6 авторов
        b2.getAuthors().add(a1);
        b2.getAuthors().add(a2);
        b2.getAuthors().add(a3);
        b2.getAuthors().add(a4);
        b2.getAuthors().add(a5);
        b2.getAuthors().add(a6);

        a1.getBooks().add(b2);
        a2.getBooks().add(b2);
        a3.getBooks().add(b2);
        a4.getBooks().add(b2);
        a5.getBooks().add(b2);
        a6.getBooks().add(b2);

        // Вывести информацию о книге Книга Джунглей, сколько авторов ее писало
        System.out.println(b1);
        Iterator<Author> iter1 = b1.getAuthors().iterator();
        while (iter1.hasNext()) {
            Author author = iter1.next();
            System.out.println("\t|- " + author);
        }

        // Найти все книги, который написал 6 автор
        System.out.println(a6);
        Iterator<Book> iter2 = a6.getBooks().iterator();
        while (iter2.hasNext()) {
            Book c = iter2.next();
            System.out.println("\t|- " + c);
        }

        System.out.println("----------------------------------------------------------------------------");


        BookService bookService = new BookServiceImpl();
        // создаю первую книгу
        bookService.create(b1);
        // читаю первую книгу
        System.out.println(bookService.read(b1));
        // читаю авторов первой книги
        System.out.println(bookService.getAuthors(b1));
        // получаю список всех книг по автору
        AuthorService authorService = new AuthorServiceImpl();
        System.out.println(authorService.getBooksByAuthor(a1));
        // меняю первую книгу на вторую
        bookService.update(b1, b2);
        // проверяю, что первая книга была заменена на вторую, т.к. вторую книгу я не добавлял в список
        System.out.println(bookService.read(b2));


        // удаляю вторую книгу
        bookService.delete(b2);
    }
}
