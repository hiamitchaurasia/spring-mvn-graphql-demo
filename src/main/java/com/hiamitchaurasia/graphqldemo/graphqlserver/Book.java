package com.hiamitchaurasia.graphqldemo.graphqlserver;

import java.util.Arrays;
import java.util.List;

public record Book (String id, String name, int pageCount, String authorId, int publishedYear) {

    private static List<Book> books = Arrays.asList(
            new Book("book-1", "Effective Java", 416, "author-1", 2023),
            new Book("book-2", "Hitchhiker's Guide to the Galaxy", 208, "author-2",2020),
            new Book("book-3", "Down Under", 436, "author-3",2000)
    );

    public static Book getById(String id) {
        return books.stream()
                .filter(book -> book.id().equals(id))
                .findFirst()
                .orElse(null);
    }
}
