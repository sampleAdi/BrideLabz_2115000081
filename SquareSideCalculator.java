import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Calculate the side of the square
        double side = perimeter / 4;

        // Display the result
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", side, perimeter);

    }
}
