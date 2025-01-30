public class RemoveCharacter {
    public static String removeChar(String str, char ch) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char[] chars = str.toCharArray(); // Convert string to char array
        int index = 0;

        for (char c : chars) {
            if (c != ch) {
                chars[index++] = c; // Keep only characters that are not 'ch'
            }
        }

        return new String(chars, 0, index); // Create new string from modified array
    }

    public static void main(String[] args) {
        String input = "Hello World";
        char removeChar = 'l';
        String output = removeChar(input, removeChar);
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + output);
    }
}
