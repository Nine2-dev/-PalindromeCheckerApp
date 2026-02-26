public class PalindromCheckerApp {
    public static void main(String[] args) {
        String input = "radar";  // The word to check
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        // Check palindrome using while loop
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;  // Exit the loop if characters don't match
            }
            start++;
            end--;
        }

        // Output result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}