import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter a date (yyyy-MM-dd): ");
        LocalDate inputDate = LocalDate.parse(scanner.nextLine(), formatter);

        LocalDate modifiedDate = inputDate.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Modified Date: " + modifiedDate.format(formatter));
        scanner.close();
    }
}