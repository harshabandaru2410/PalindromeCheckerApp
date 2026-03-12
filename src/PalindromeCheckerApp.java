public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Application Version: 1.0");

        // UC2
        String word = "madam";
        String reversed = "";

        for(int i = word.length()-1; i >= 0; i--)
            reversed += word.charAt(i);

        if(word.equals(reversed))
            System.out.println(word + " is a Palindrome");
        else
            System.out.println(word + " is not a Palindrome");

    }
}