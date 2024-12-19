// Book.java
package org.example;
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean available;

    // Constructor to initialize the book object
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = true;  // Default availability is true
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Method to toggle availability
    public void toggleAvailability() {
        this.available = !this.available;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', ISBN='" + ISBN + "', available=" + available + '}';
    }
}
