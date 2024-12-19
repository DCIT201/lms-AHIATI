
package org.example;

public class App {

    // Method to check the process  of borrowing a book
    public static void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.toggleAvailability();
            System.out.println("You have borrowed: " + book.getTitle());
        } else {
            System.out.println("Sorry, the book " + book.getTitle() + " is not available.");
        }
    }

    // Method to check the process of returning a book
    public static void returnBook(Book book) {
        if (!book.isAvailable()) {
            book.toggleAvailability();  // Marking  the book as available
            System.out.println("You have returned: " + book.getTitle());
        } else {
            System.out.println("The book " + book.getTitle() + " was not borrowed.");
        }
    }

    public static void main(String[] args) {
        // Create some book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");

        // Print out book details before any operations
        System.out.println("Books available in the library:");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        // checking  borrowing a book
        borrowBook(book1);
        borrowBook(book2); // Trying to borrow a second book

        // checking returning a book
        returnBook(book1);

        // Check the books' availability status after borrowing and returning
        System.out.println("\nBooks after borrowing and returning:");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
