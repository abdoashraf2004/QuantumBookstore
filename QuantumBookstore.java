/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quantum.bookstore;

/**
 *
 * @author B-TECK
 */
import java.util.ArrayList;

public class QuantumBookstore{
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Quantum book store: Book added - " + book.title);
    }

    public void removeOutdatedBooks(int maxYearsOld) {
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        ArrayList<Book> toRemove = new ArrayList<>();

        for (Book book : books) {
            if (currentYear - book.year > maxYearsOld) {
                toRemove.add(book);
                System.out.println("Quantum book store: Removed outdated book - " + book.title);
            }
        }

        books.removeAll(toRemove);
    }

    public double buyBook(String isbn, int quantity, String email, String address) {
        for (Book book : books) {
            if (book.isbn.equals(isbn)) {
                if (!book.isAvailable()) {
                    throw new RuntimeException("Book not available");
                }
                return book.buy(quantity, email, address);
            }
        }
        throw new RuntimeException("Book with this ISBN not found");
    }
}