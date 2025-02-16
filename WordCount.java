import java.io.*;

public class WordCount {
    public static void main(String[] args) {
        String fileName = "example.txt"; // Change this to your file path
        String targetWord = "Java"; // Word to count
        int wordCount = countWordOccurrences(fileName, targetWord);

        System.out.println("The word \"" + targetWord + "\" appears " + wordCount + " times in the file.");
    }

    public static int countWordOccurrences(String fileName, String targetWord) {
        int count = 0;

        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split by spaces and punctuation
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) { // Case-insensitive match
                        count++;
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        return count;
    }
}
