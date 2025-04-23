package model;

public class Book {
    private String bookTitle;
    private String author;

    public Book(String author, String bookTitle) {
        this.author = author;
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return "Book: " +
                "bookTitle='" + bookTitle + '\'' +
                ", author='" + author + '\'';
    }

}
