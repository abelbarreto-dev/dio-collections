package edu.map.book_store;

import edu.map.book_store.core.BookStoreInterface;
import edu.map.book_store.core.OnlineBookStore;

public class App {
    public static void main(String[] args) {
        try {
            BookStoreInterface bookStore = new OnlineBookStore();

            bookStore.addNewBook("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50d);
            bookStore.addNewBook("https://amzn.to/47Umiun", "A Revolução dos Bichos", "George Orwell", 7.05d);
            bookStore.addNewBook("https://amzn.to/3L1FFI6", "Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
            bookStore.addNewBook("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 5d);
            bookStore.addNewBook("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum", "Agatha Christie", 50d);
            bookStore.addNewBook("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente", "Agatha Christie", 5d);

            System.out.println("books by price\n".toUpperCase() + bookStore.findBooksByPrice());

            String author = "Josh Malerman";
            System.out.println("books by author\n".toUpperCase() + bookStore.findBooksByAuthor(author));

            System.out.println("expansive book: " + bookStore.findExpansiveBook());

            System.out.println("not expansive book: " + bookStore.findNotExpansiveBook());

            bookStore.showAllBooks();

            bookStore.deleteBook("https://amzn.to/3L1FFI6");

            bookStore.showAllBooks();
        }
        catch (RuntimeException re) {
            System.err.println(re.getMessage());
        }
    }
}
