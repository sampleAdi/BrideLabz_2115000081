import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        // Define source and destination file paths
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        // FileInputStream and FileOutputStream for reading and writing files
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("File copied successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Source file '" + sourceFile + "' not found.");
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
