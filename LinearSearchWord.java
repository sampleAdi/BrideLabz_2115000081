public class LinearSearchWord {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) { // Case-insensitive search
                return sentence; // Return the first matching sentence
            }
        }
        return "Not Found"; // Return if no sentence contains the word
    }

    public static void main(String[] args) {
        String[] sentences = {
            "Java is a popular programming language.",
            "Python is widely used in AI and data science.",
            "Web development includes HTML, CSS, and JavaScript.",
            "Java is also used for Android development."
        };

        String word = "java"; // Word to search (case-insensitive)

        String result = findSentenceWithWord(sentences, word);
        System.out.println("Sentence found: " + result);
    }
}
