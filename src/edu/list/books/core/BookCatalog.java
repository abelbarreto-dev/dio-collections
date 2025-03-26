package edu.list.books.core;

import edu.list.books.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog implements IBookCatalog {
    private final List<Book> books;

    public BookCatalog() {
        this.books = new ArrayList<Book>();
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public void addBook(String title, String author, int publishYear) {
        var book = new Book(title, author, publishYear);

        this.books.add(book);

        System.out.println("Book added!");
    }

    @Override
    public List<Book> findBooksByAuthor(final String author) {
        List<Book> foundBooks = new  ArrayList<Book>();

        this.getBooks().forEach((Book book) -> {
            if (book.getAuthor().equalsIgnoreCase(author))
                foundBooks.add(book);
        });

        return foundBooks;
    }

    @Override
    public List<Book> findBooksByYearRange(final int initYear, final int finishYear) {
        List<Book> foundBooks = new ArrayList<Book>();

        this.getBooks().forEach((Book book) -> {
            if (initYear <= book.getPublishYear() && book.getPublishYear() <= finishYear) {
                foundBooks.add(book);
            }
        });

        return foundBooks;
    }

    @Override
    public Book findFirstByBookTitle(String title) {
        Book foundBook = null;

        for (Book book : this.getBooks()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                foundBook = book;
                break;
            }
        }

        return foundBook;
    }
}
