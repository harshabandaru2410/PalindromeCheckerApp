import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Application Version: 1.0");

        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--)
            reversed += word.charAt(i);

        if (word.equals(reversed))
            System.out.println(word + " is a Palindrome");
        else
            System.out.println(word + " is not a Palindrome");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check palindrome: ");
        String input = sc.nextLine();

        String rev = "";

        for (int i = input.length() - 1; i >= 0; i--)
            rev += input.charAt(i);

        System.out.println(input.equals(rev)
                ? "Palindrome"
                : "Not a Palindrome");

        sc.close();
    }
}