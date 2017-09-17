
public class Book {
    public String author;
    private String title;
    private double price;

    public Book(String a, String t, double p) {
        author = a;
        title = t;
        price = p;
    }
    
    
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
    
}
