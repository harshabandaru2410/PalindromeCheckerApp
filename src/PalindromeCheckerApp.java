public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");

        // UC2
        String input = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC2 Result: " + isPalindrome);

        // UC3
        String word = "level";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        System.out.println("Original String: " + word);
        System.out.println("Reversed String: " + reversed);

        if (word.equals(reversed)) {
            System.out.println("UC3 Result: Palindrome");
        } else {
            System.out.println("UC3 Result: Not a Palindrome");
        }

        // UC4
        String input2 = "radar";

        char[] chars = input2.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome2 = true;

        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome2 = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Input : " + input2);
        System.out.println("Is Palindrome? : " + isPalindrome2);
    }
}