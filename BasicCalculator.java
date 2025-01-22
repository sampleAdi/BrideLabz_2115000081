import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input two numbers
        System.out.print("Enter the first number: ");
        float number1 = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float number2 = scanner.nextFloat();

        // Perform arithmetic operations
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number2 != 0 ? number1 / number2 : Float.NaN; // Handle division by zero

        // Print the results
        System.out.println("The addition, subtraction, multiplication, and division of " + number1 + " and " + number2 + " are:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        if (number2 != 0) {
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division: Undefined (division by zero is not allowed)");
        }

    }
}
