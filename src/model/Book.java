package model;

public class Book {
    private String bookTitle;

    public Book(String title) {
        this.bookTitle = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + bookTitle + '\'' +
                '}';
    }
}
