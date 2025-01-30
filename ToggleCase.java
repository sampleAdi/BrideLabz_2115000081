public class ToggleCase {
    public static String toggleCase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char[] chars = str.toCharArray(); // Convert string to char array

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]); // Convert to lowercase
            } else if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]); // Convert to uppercase
            }
        }

        return new String(chars); // Convert char array back to string
    }

    public static void main(String[] args) {
        String input = "Hello World!";
        String output = toggleCase(input);
        System.out.println("Original: " + input);
        System.out.println("Toggled: " + output);
    }
}
