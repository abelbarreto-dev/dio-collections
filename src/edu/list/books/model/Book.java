package edu.list.books.model;

public class Book {
    private final String title;
    private final String author;
    private final int publishYear;

    public Book(String title, String author, int publishYear) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String toString() {
        return "{\"title\": \"%s\", \"author\": \"%s\", \"publishYear\": %d}".formatted(
                this.getTitle(),
                this.getAuthor(),
                this.getPublishYear()
        );
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }
}
