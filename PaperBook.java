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
public class PaperBook extends Book {
    int stock;

    public PaperBook(String isbn, String title, int year, double price, String author, int stock) {
        super(isbn, title, year, price, author);
        this.stock = stock;}

    public boolean isAvailable() {
        return stock > 0;}

    public double buy(int quantity, String email, String address) {
        if (quantity > stock) {
            System.out.println("Not enough stock");}
        
        stock -= quantity;
        System.out.println("Sending paper book to address: " + address);
        return price * quantity;
    }}

