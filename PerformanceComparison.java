import java.io.*;

public class PerformanceComparison {
    public static void main(String[] args) {
        int iterations = 1_000_000;
        String text = "hello";
        String fileName = "large_text_file.txt"; // Change this to your actual file path

        // Compare StringBuilder and StringBuffer
        compareStringConcatenation(iterations, text);

        // Compare FileReader and InputStreamReader for word counting
        compareFileReadingMethods(fileName);
    }

    public static void compareStringConcatenation(int iterations, String text) {
        // StringBuilder performance test
        long startTimeBuilder = System.nanoTime();
        StringBuilder sbBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sbBuilder.append(text);
        }
        long durationBuilder = System.nanoTime() - startTimeBuilder;

        // StringBuffer performance test
        long startTimeBuffer = System.nanoTime();
        StringBuffer sbBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbBuffer.append(text);
        }
        long durationBuffer = System.nanoTime() - startTimeBuffer;

        // Print results
        System.out.println("StringBuilder time: " + durationBuilder / 1_000_000 + " ms");
        System.out.println("StringBuffer time: " + durationBuffer / 1_000_000 + " ms");
    }

    public static void compareFileReadingMethods(String fileName) {
        // Measure FileReader performance
        long fileReaderTime = measureWordCountUsingFileReader(fileName);
        System.out.println("FileReader word count time: " + fileReaderTime / 1_000_000 + " ms");

        // Measure InputStreamReader performance
        long inputStreamReaderTime = measureWordCountUsingInputStreamReader(fileName);
        System.out.println("InputStreamReader word count time: " + inputStreamReaderTime / 1_000_000 + " ms");
    }

    public static long measureWordCountUsingFileReader(String fileName) {
        long startTime = System.nanoTime();
        int wordCount = 0;

        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length; // Split by whitespace
            }

        } catch (IOException e) {
            System.err.println("Error reading file with FileReader: " + e.getMessage());
        }

        long duration = System.nanoTime() - startTime;
        System.out.println("Word count (FileReader): " + wordCount);
        return duration;
    }

    public static long measureWordCountUsingInputStreamReader(String fileName) {
        long startTime = System.nanoTime();
        int wordCount = 0;

        try (FileInputStream fis = new FileInputStream(fileName);
             InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length; // Split by whitespace
            }

        } catch (IOException e) {
            System.err.println("Error reading file with InputStreamReader: " + e.getMessage());
        }

        long duration = System.nanoTime() - startTime;
        System.out.println("Word count (InputStreamReader): " + wordCount);
        return duration;
    }
}
