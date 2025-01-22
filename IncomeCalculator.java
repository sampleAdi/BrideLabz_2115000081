import java.util.Scanner;

public class IncomeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input the salary
        System.out.print("Enter the salary (INR): ");
        double salary = sc.nextDouble();

        // Input the bonus
        System.out.print("Enter the bonus (INR): ");
        double bonus = sc.nextDouble();

        // Calculate total income
        double totalIncome = salary + bonus;

        // Print the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);

    }
}
