package edu.list.books;

import edu.list.books.core.BookCatalog;
import edu.list.books.core.IBookCatalog;

public class App {
    public static void main(String[] args) {
        IBookCatalog catalog = new BookCatalog();

        catalog.addBook("o peregrino", "Abel", 2003);
        catalog.addBook("a peregrina", "Abel", 1998);
        catalog.addBook("o peregrino", "Abel", 2001);
        catalog.addBook("a peregrina", "Abel", 2025);
        catalog.addBook("o peregrino", "Abel", 1996);

        System.out.println(catalog.findBooksByAuthor("abel")); // ok
        System.out.println(catalog.findFirstByBookTitle("a peregrina")); // ok
        System.out.println(catalog.findBooksByYearRange(1998, 2003)); // ok
    }
}
