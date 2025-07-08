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
public class ShowcaseBook extends Book {
    public ShowcaseBook(String isbn, String title, int year, double price, String author) {
        super(isbn, title, year, 0.0, author);
    }

    public boolean isAvailable() {
        return false;
    }

    public double buy(int quantity, String email, String address) {
        throw new RuntimeException("Quantum book store: Showcase book is not for sale");
    }}

