public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Default Constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.isAvailable = true;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The book '" + title + "' has been borrowed.");
            return true;
        } else {
            System.out.println("Sorry, the book '" + title + "' is currently unavailable.");
            return false;
        }
    }

    // Display Book Details
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        // Using default constructor
        Book defaultBook = new Book();
        defaultBook.displayBookInfo();

        System.out.println();

        // Using parameterized constructor
        Book customBook = new Book("Java Programming", "James Gosling", 45.99);
        customBook.displayBookInfo();

        System.out.println();

        // Borrowing a book
        customBook.borrowBook();
        customBook.displayBookInfo();
    }
}
