import java.util.*;

public class PalindromCheckerApp {
    public static void main(String[] args) {
        // Define the input string to validate
        String input = "civic";

        // Create a queue to store characters in FIFO order
        Queue<Character> queue = new LinkedList<>();

        // Create a stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare queue becomes empty
        while (!queue.isEmpty()) {
            if (queue.poll() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("\"" + input + "\" is palindrome: " + isPalindrome);
        // Output: "civic" is palindrome: true
    }
}
