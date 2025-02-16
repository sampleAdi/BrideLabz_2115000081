import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        String fileName = "example.txt"; // Change this to your file path

        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
