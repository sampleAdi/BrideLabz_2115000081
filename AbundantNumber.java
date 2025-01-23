import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        System.out.println("Finding divisors of " + number + "...");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Divisor found: " + i);
                sum += i;
            }
        }

        System.out.println("Sum of divisors: " + sum);
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is Not an Abundant Number");
        }
    }
}
