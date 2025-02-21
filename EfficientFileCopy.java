import java.io.*;

public class EfficientFileCopy {
    public static void main(String[] args) {
        // Source and destination file paths
        String sourceFile = "largeFile.txt";  // Example: 100MB file
        String destinationFile1 = "copy_buffered.txt";
        String destinationFile2 = "copy_unbuffered.txt";

        // Measure execution time for Buffered Streams
        long bufferedTime = copyUsingBufferedStreams(sourceFile, destinationFile1);

        // Measure execution time for Normal Streams
        long unbufferedTime = copyUsingNormalStreams(sourceFile, destinationFile2);

        // Print execution times
        System.out.println("\nPerformance Comparison:");
        System.out.println("Buffered Streams Time:   " + bufferedTime / 1_000_000 + " ms");
        System.out.println("Unbuffered Streams Time: " + unbufferedTime / 1_000_000 + " ms");
    }

    // Method to copy using Buffered Streams (Efficient)
    private static long copyUsingBufferedStreams(String source, String destination) {
        long startTime = System.nanoTime();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[4096];  // 4 KB buffer
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully using Buffered Streams!");

        } catch (IOException e) {
            System.out.println("Error (Buffered): " + e.getMessage());
        }

        return System.nanoTime() - startTime;  // Return execution time
    }

    // Method to copy using Normal Streams (Less Efficient)
    private static long copyUsingNormalStreams(String source, String destination) {
        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully using Normal Streams!");

        } catch (IOException e) {
            System.out.println("Error (Unbuffered): " + e.getMessage());
        }

        return System.nanoTime() - startTime;  // Return execution time
    }
}
