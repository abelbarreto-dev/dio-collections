package edu.map.book_store.core;

import edu.map.book_store.comparator.BookByAuthorComparator;
import edu.map.book_store.comparator.BookByPriceComparator;
import edu.map.book_store.model.Book;

import java.util.*;

public class OnlineBookStore implements BookStoreInterface {
    private final Map<String, Book> books;

    public OnlineBookStore() {
        this.books = new HashMap<>();
    }

    protected Map<String, Book> getBooks() {
        return books;
    }

    @Override
    public void addNewBook(String isbn, String title, String author, double price) {
        System.out.println("adding new book".toUpperCase());
        var book = new Book(title, author, price);

        if (this.getBooks().put(isbn, book) != null)
            throw new RuntimeException("error: isbn already exists.");

        System.out.println("success: book added.");
    }

    @Override
    public void deleteBook(String isbn) {
        System.out.println("deleting book".toUpperCase());
        this.checkBooksEmpty();

        if (this.getBooks().remove(isbn) == null)
            throw new RuntimeException("error: ebook not found.");

        System.out.println("success: book deleted.");
    }

    @Override
    public void showAllBooks() {
        System.out.println("show all books".toUpperCase());
        this.checkBooksEmpty();

        this.getBooks().forEach(
            (String isbn, Book book) -> {
                System.out.println("{ 'isbn': '" + isbn + "', 'book': '" + book + "' }");
            }
        );
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        this.checkBooksEmpty();

        var values = this.getBooks().values().stream().toList();

        List<Book> orderedBook = new ArrayList<>(values);

        orderedBook.sort(new BookByAuthorComparator());

        return orderedBook;
    }

    @Override
    public List<Book> findBooksByPrice() {
        this.checkBooksEmpty();

        var values = this.getBooks().values().stream().toList();

        List<Book> orderedBook = new ArrayList<>(values);

        orderedBook.sort(new BookByPriceComparator());

        return orderedBook;
    }

    @Override
    public Book findExpansiveBook() {
        this.checkBooksEmpty();

        double maximum = Double.MIN_VALUE;
        Book expansiveBook = null;

        for (Book book : this.getBooks().values())
            if (book.getPrice() > maximum) {
                maximum = book.getPrice();
                expansiveBook = book;
            }

        return expansiveBook;
    }

    @Override
    public Book findNotExpansiveBook() {
        this.checkBooksEmpty();

        this.checkBooksEmpty();

        double minimun = Double.MAX_VALUE;
        Book notExpansiveBook = null;

        for (Book book : this.getBooks().values())
            if (book.getPrice() < minimun) {
                minimun = book.getPrice();
                notExpansiveBook = book;
            }

        return notExpansiveBook;
    }

    private void checkBooksEmpty() {
        if (this.getBooks().isEmpty())
            throw new RuntimeException("error: books map is empty.");
    }
}
