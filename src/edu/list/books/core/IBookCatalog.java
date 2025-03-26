package edu.list.books.core;

import edu.list.books.model.Book;

import java.util.List;

public interface IBookCatalog {
    void addBook(String title, String author, int publishYear);
    List<Book> findBooksByAuthor(final String author);
    List<Book> findBooksByYearRange(final int initYear, final int finishYear);
    Book findFirstByBookTitle(String title);
}
