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
public class QuantumBookstoreFullTest {
    public static void main(String[] args) {
        QuantumBookstore store = new QuantumBookstore();

        Book paper = new PaperBook("1", "أساسيات البرمجة", 2014, 100.0, "أحمد علاء", 4);
        Book ebook = new EBook("2", "تعلم بايثون خطوة بخطوة", 2021, 85.0, "سارة ", "PDF");
        Book showcase = new ShowcaseBook("3", "تاريخ الذكاء الصناعي", 2005, 0.0, "محمود نبيل");

        store.addBook(paper);
        store.addBook(ebook);
        store.addBook(showcase);

        double total = store.buyBook("1", 2, "mohamed123@gmail.com", " شارع الجيش");
        System.out.println("Quantum book store: Total paid: " + total);

        total = store.buyBook("2", 1, "nada2024@gmail.com", "لا يوجد");
        System.out.println("Quantum book store: Total paid: " + total);

        try {
            store.buyBook("3", 1, "someone@gmail.com", "أي مكان");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        store.removeOutdatedBooks(10);
    }
}
