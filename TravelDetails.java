import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input user details and cities
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter the starting city: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter the final destination city: ");
        String toCity = sc.nextLine();

        // Input distances in miles
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = sc.nextDouble();

        // Input time taken for each part of the journey
        System.out.print("Enter the time taken to travel from " + fromCity + " to " + viaCity + " in hours: ");
        double timeFromToVia = sc.nextDouble();

        System.out.print("Enter the time taken to travel from " + viaCity + " to " + toCity + " in hours: ");
        double timeViaToFinalCity = sc.nextDouble();

        // Calculate total distance and total time
        double totalDistance = fromToVia + viaToFinalCity;
        double totalTime = timeFromToVia + timeViaToFinalCity;

        // Calculate average speed (distance/time)
        double averageSpeed = totalDistance / totalTime;

        // Print the results
        System.out.println("\nTravel Details for " + name + ":");
        System.out.println("Total Distance Travelled: " + totalDistance + " miles");
        System.out.println("Total Time Taken: " + totalTime + " hours");
        System.out.println("Average Speed: " + averageSpeed + " miles per hour");
    }
}
