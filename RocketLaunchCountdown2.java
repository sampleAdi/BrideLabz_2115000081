import java.util.Scanner;
public class RocketLaunchCountdown2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown start value: ");
        int counter = sc.nextInt();
        for (int i = counter; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Blast off!");
        sc.close();
    }
}
