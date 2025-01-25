import java.util.Scanner;

public class BMICalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // Create arrays to store weight, height, BMI, and weight status
        double[] weight = new double[numberOfPersons];
        double[] height = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];

        // Take input for the weight and height of each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");

            // Validate weight input
            while (true) {
                System.out.print("Enter weight (in kg): ");
                weight[i] = scanner.nextDouble();
                if (weight[i] > 0) {
                    break;
                } else {
                    System.out.println("Weight must be a positive number.");
                }
            }

            // Validate height input
            while (true) {
                System.out.print("Enter height (in meters): ");
                height[i] = scanner.nextDouble();
                if (height[i] > 0) {
                    break;
                } else {
                    System.out.println("Height must be a positive number.");
                }
            }

            // Calculate BMI (BMI = weight / (height * height))
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status based on BMI
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        System.out.println("\nPerson Details:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("Height: " + height[i] + " meters");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Weight Status: " + weightStatus[i]);
        }

        scanner.close();
    }
}
