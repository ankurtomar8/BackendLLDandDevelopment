package Milestone1;

public class Book extends Item {
    String book;

    public Book(String id, String name, double price, int quantity, String book) {
        super(id, name, price, quantity);
        this.book = book;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }
}
