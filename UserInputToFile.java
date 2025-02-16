import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        String fileName = "user_input.txt"; // File to store user input

        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             FileWriter fw = new FileWriter(fileName, true); // Append mode
             BufferedWriter bw = new BufferedWriter(fw)) {

            System.out.println("Enter text (type 'exit' to stop):");

            String input;
            while (!(input = br.readLine()).equalsIgnoreCase("exit")) {
                bw.write(input);
                bw.newLine(); // Write a new line in the file
            }

            System.out.println("User input saved to " + fileName);

        } catch (IOException e) {
            System.err.println("Error handling file: " + e.getMessage());
        }
    }
}
