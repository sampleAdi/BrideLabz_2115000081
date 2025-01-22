import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input base and height of the triangle
        System.out.print("Enter the base of the triangle in inches: ");
        double baseInInches = scanner.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double heightInInches = scanner.nextDouble();

        // Calculate area in square inches
        double areaInInches = 0.5 * baseInInches * heightInInches;

        // Convert base and height to centimeters (1 inch = 2.54 cm)
        double baseInCm = baseInInches * 2.54;
        double heightInCm = heightInInches * 2.54;

        // Calculate area in square centimeters
        double areaInCm = 0.5 * baseInCm * heightInCm;

        // Convert height from centimeters to feet and inches
        double heightInFeet = heightInCm / 30.48; // 1 foot = 30.48 cm
        int feet = (int) heightInFeet; // Extract feet
        double remainingInches = (heightInFeet - feet) * 12; // Convert fractional feet to inches

        // Display the results
        System.out.println("The area of the triangle is:");
        System.out.printf("- %.2f square inches\n", areaInInches);
        System.out.printf("- %.2f square centimeters\n", areaInCm);

        System.out.println("Your height in different units:");
        System.out.printf("- In centimeters: %.2f cm\n", heightInCm);
        System.out.printf("- In feet and inches: %d feet and %.2f inches\n", feet, remainingInches);
    }
}
