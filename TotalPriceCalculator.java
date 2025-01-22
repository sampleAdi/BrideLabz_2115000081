import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the unit price and quantity
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter the quantity of the item: ");
        int quantity = scanner.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f\n", totalPrice, quantity, unitPrice);
    }
}
