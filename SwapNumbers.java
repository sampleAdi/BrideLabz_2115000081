import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        // Print original numbers
        System.out.println("Before swapping: number1 = " + number1 + ", number2 = " + number2);

        // Swap the numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Print swapped numbers
        System.out.println("After swapping: number1 = " + number1 + ", number2 = " + number2);
    }
}
