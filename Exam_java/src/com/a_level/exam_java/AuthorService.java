package com.a_level.exam_java;

import java.util.List;

public interface AuthorService {
    List<Book> getBooksByAuthor(Author author);

}

