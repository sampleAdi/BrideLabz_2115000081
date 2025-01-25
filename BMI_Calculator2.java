import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        // Create a 2D array to store height, weight, and BMI
        double[][] personData = new double[number][3];
        // Create an array to store the weight status
        String[] weightStatus = new String[number];

        // Take input for weight and height of each person
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");

            // Get weight and height, ensuring they are positive values
            double weight = -1;
            double height = -1;

            while (weight <= 0) {
                System.out.print("Enter weight (in kg): ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Invalid input. Weight must be a positive value.");
                }
            }

            while (height <= 0) {
                System.out.print("Enter height (in meters): ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Invalid input. Height must be a positive value.");
                }
            }

            // Store weight and height in the personData array
            personData[i][0] = weight;
            personData[i][1] = height;

            // Calculate BMI (BMI = weight / (height * height))
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine the weight status based on BMI
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the details for each person
        System.out.println("\nPerson Details:");
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " meters");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
        }

        scanner.close();
    }
}
