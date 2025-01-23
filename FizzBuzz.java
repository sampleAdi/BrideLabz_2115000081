import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Loop from 0 to the input number
            for (int i = 0; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz"); // Multiples of both 3 and 5
                } else if (i % 3 == 0) {
                    System.out.println("Fizz"); // Multiples of 3
                } else if (i % 5 == 0) {
                    System.out.println("Buzz"); // Multiples of 5
                } else {
                    System.out.println(i); // Print the number
                }
            }
        }

        scanner.close();
    }
}
