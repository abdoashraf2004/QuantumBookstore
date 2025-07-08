
package quantum.bookstore;

/**
 *
 * @author B-TECK
 */
public abstract class Book {
    String isbn;
    String title;
    int year;
    double price;
    String author;

    public Book(String isbn, String title, int year, double price, String author) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
        this.author = author;
    }

    public abstract boolean isAvailable();
    public abstract double buy(int quantity, String email, String address);
    }