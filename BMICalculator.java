import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for weight and height
        System.out.print("Enter your weight in kilograms (kg): ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter your height in centimeters (cm): ");
        double heightCm = scanner.nextDouble();
        
        // Convert height from centimeters to meters
        double heightM = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightM * heightM);

        // Display the BMI result
        System.out.println("Your BMI is: " + bmi);

        // Determine the weight status based on BMI
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}
