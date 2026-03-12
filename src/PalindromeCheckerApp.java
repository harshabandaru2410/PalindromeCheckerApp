import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ================= UC1 =================
        System.out.println("Welcome to the Palindrome Checker App");
        System.out.println("Application Version: 1.0");
        System.out.println();

        // ================= UC2 =================
        System.out.println("UC2: Hardcoded Palindrome Check");

        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }

        System.out.println();

        // ================= UC3 =================
        System.out.println("UC3: Palindrome Check Using String Reverse");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String rev = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            rev = rev + input.charAt(i);
        }

        if (input.equals(rev)) {
            System.out.println("Palindrome (Using Reverse)");
        } else {
            System.out.println("Not a Palindrome (Using Reverse)");
        }

        System.out.println();

        // ================= UC4 =================
        System.out.println("UC4: Character Array Palindrome Check");

        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome (Using Character Array)");
        } else {
            System.out.println("Not a Palindrome (Using Character Array)");
        }

        System.out.println();

        // ================= UC5 =================
        System.out.println("UC5: Stack Based Palindrome Check");

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String stackReverse = "";

        while (!stack.isEmpty()) {
            stackReverse = stackReverse + stack.pop();
        }

        if (input.equals(stackReverse)) {
            System.out.println("Palindrome (Using Stack)");
        } else {
            System.out.println("Not a Palindrome (Using Stack)");
        }

        System.out.println();

        // ================= UC6 =================
        System.out.println("UC6: Queue + Stack Palindrome Check");

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            queue.add(input.charAt(i));
            stack2.push(input.charAt(i));
        }

        boolean qsPalindrome = true;

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack2.pop())) {
                qsPalindrome = false;
                break;
            }
        }

        if (qsPalindrome) {
            System.out.println("Palindrome (Using Queue + Stack)");
        } else {
            System.out.println("Not a Palindrome (Using Queue + Stack)");
        }

        System.out.println();

        // ================= UC7 =================
        System.out.println("UC7: Deque Based Palindrome Check");

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean dequePalindrome = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                dequePalindrome = false;
                break;
            }
        }

        if (dequePalindrome) {
            System.out.println("Palindrome (Using Deque)");
        } else {
            System.out.println("Not a Palindrome (Using Deque)");
        }

        sc.close();
    }
}