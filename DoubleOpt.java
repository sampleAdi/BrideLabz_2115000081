import java.text.DecimalFormat;
import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input double values for a, b, and c
        System.out.print("Enter the value of a (double): ");
        double a = sc.nextDouble();

        System.out.print("Enter the value of b (double): ");
        double b = sc.nextDouble();

        System.out.print("Enter the value of c (double): ");
        double c = sc.nextDouble();

        // Perform double operations considering operator precedence
        double result1 = a + b * c;       // Multiplication (*) has higher precedence than addition (+)
        double result2 = a * b + c;       // Multiplication (*) is evaluated first, then addition (+)
        double result3 = c + a / b;       // Division (/) has higher precedence than addition (+)
        double result4 = a % b + c;       // Modulus (%) is evaluated first, then addition (+)

        DecimalFormat df = new DecimalFormat("#.##");

        // Print the results
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + df.format(result1));
        System.out.println("a * b + c = " + df.format(result2));
        System.out.println("c + a / b = " + df.format(result3));
        System.out.println("a % b + c = " + df.format(result4));
    }
}
