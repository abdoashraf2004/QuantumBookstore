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
public class EBook extends Book {
    String fileType;

    public EBook(String isbn, String title, int year, double price, String author, String fileType) {
        super(isbn, title, year, price, author);
        this.fileType = fileType;
    }

    public boolean isAvailable() {
        return true;
    }

    public double buy(int quantity, String email, String address) {
        if (quantity != 1) {
            System.out.println("Only one ebook per transaction");
        }
        System.out.println("Sending ebook to email: " + email);
        return price;
    }
}

