public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 50.0; // Example daily rental rate

    // Default Constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Standard Model";
        this.rentalDays = 1;
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }

    // Display Rental Details
    public void displayRentalInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Using default constructor
        CarRental defaultRental = new CarRental();
        defaultRental.displayRentalInfo();

        System.out.println();

        // Using parameterized constructor
        CarRental customRental = new CarRental("John Doe", "Toyota Corolla", 5);
        customRental.displayRentalInfo();
    }
}
