package edu.map.book_store.comparator;

import edu.map.book_store.model.Book;

import java.util.Comparator;

public class BookByPriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
