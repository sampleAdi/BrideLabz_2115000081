import java.io.*;

public class UpperToLowerCaseConverter {
    public static void main(String[] args) {
        String inputFile = "input.txt";  // Change to your source file
        String outputFile = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());  // Convert to lowercase
                writer.newLine();  // Maintain line structure
            }

            System.out.println("File converted successfully! Output saved in " + outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
