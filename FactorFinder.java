import java.util.Scanner;

public class FactorFinder {
    public static void main(String[] args) {
        // Create a scanner to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find and print the factors of the number
        System.out.println("The factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
