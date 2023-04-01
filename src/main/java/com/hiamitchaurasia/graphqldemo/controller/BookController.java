package com.hiamitchaurasia.graphqldemo.controller;

import com.hiamitchaurasia.graphqldemo.graphqlserver.Author;
import com.hiamitchaurasia.graphqldemo.graphqlserver.AuthorAddress;
import com.hiamitchaurasia.graphqldemo.graphqlserver.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @QueryMapping
    public Book bookById(@Argument String id) {
        return Book.getById(id);
    }

    @QueryMapping
    public Author authorById(@Argument String id) {
        return Author.getById(id);
    }

    @QueryMapping
    public AuthorAddress authorAddressById(@Argument String id) {
        return AuthorAddress.getById(id);
    }

    @SchemaMapping
    public Author author(Book book) {
        return Author.getById(book.authorId());
    }
}
