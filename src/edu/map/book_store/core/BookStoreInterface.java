package edu.map.book_store.core;

import edu.map.book_store.model.Book;

import java.util.List;

public interface BookStoreInterface {
    void addNewBook(String isbn, String title, String author, double price);
    void deleteBook(String isbn);
    void showAllBooks();
    List<Book> findBooksByAuthor(String author);
    List<Book> findBooksByPrice();
    Book findExpansiveBook();
    Book findNotExpansiveBook();
}
