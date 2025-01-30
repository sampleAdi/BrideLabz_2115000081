import java.util.HashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        HashSet<Character> seen = new HashSet<>();
        char[] result = new char[str.length()];
        int index = 0;

        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result[index++] = ch;
            }
        }
        
        return new String(result, 0, index);
    }

    public static void main(String[] args) {
        String input = "programming";
        String output = removeDuplicates(input);
        System.out.println("Original: " + input);
        System.out.println("Without Duplicates: " + output);
    }
}
