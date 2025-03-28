package edu.map.book_store.comparator;

import edu.map.book_store.model.Book;

import java.util.Comparator;

public class BookByAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
