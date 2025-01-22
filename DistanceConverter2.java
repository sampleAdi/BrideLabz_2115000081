import java.util.Scanner;

public class DistanceConverter2 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Convert the distance to yards and miles
        double distanceInYards = distanceInFeet / 3;  // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760;  // 1 mile = 1760 yards

        // Display the result
        System.out.printf("The distance in yards is %.2f and in miles is %.4f\n", distanceInYards, distanceInMiles);

    }
}
