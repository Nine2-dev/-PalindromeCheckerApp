import java.util.Stack;
public class PalindromCheckerApp {
    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();

        // Push all characters onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Pop from stack and compare with input string
        boolean isPalindrome = true;
        for (char c : input.toCharArray()) {
            if (stack.isEmpty() || stack.pop() != c) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }

    public static void main(String[] args) {
        String input = "noon";
        System.out.println("\"" + input + "\" is palindrome: " + isPalindrome(input));
        // Output: "noon" is palindrome: true
    }
}