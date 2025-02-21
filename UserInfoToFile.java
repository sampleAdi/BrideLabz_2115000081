import java.io.*;

public class UserInfoToFile {
    public static void main(String[] args) {
        // File to store user input
        String outputFile = "user_info.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(outputFile, true)) { // Append mode

            // Asking user for details
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Writing to file
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + language + "\n");
            writer.write("---------------------------\n");

            System.out.println("User information saved successfully in " + outputFile);

        } catch (IOException e) {
            System.out.println("An error occurred while reading input or writing to file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for age. Please enter a valid number.");
        }
    }
}
