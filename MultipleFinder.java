import java.util.Scanner;

public class MultipleFinder {
    public static void main(String[] args) {
        // Create a scanner to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find and print the multiples of the number below 100
        System.out.println("The multiples of " + number + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
    }
}
