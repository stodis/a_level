package com.a_level.exam;

import java.util.List;

public interface AuthorService {
    List<Book> getBooksByAuthor(Author author);

}
