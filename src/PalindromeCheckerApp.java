import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Application Version: 1.0");

        // UC2 - Hardcoded palindrome
        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        if (word.equals(reversed))
            System.out.println(word + " is a Palindrome");
        else
            System.out.println(word + " is not a Palindrome");


        // UC3 - User input palindrome using reverse
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check palindrome: ");
        String input = sc.nextLine();

        String rev = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            rev += input.charAt(i);
        }

        if (input.equals(rev))
            System.out.println("Palindrome (Using Reverse)");
        else
            System.out.println("Not a Palindrome (Using Reverse)");


        // UC4 - Character Array Palindrome Check
        char[] arr = input.toCharArray();

        int start = 0;
        int end = arr.length - 1;
        boolean isPal = true;

        while (start < end) {

            if (arr[start] != arr[end]) {
                isPal = false;
                break;
            }

            start++;
            end--;
        }

        if (isPal)
            System.out.println("Palindrome (Using Character Array)");
        else
            System.out.println("Not a Palindrome (Using Character Array)");

        sc.close();
    }
}