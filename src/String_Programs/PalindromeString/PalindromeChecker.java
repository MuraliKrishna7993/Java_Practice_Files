package String_Programs.PalindromeString;

import java.util.stream.IntStream;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = isPalindrome(input);
        System.out.println("Is \"" + input + "\" a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        String sanitized = str.toLowerCase().replaceAll("\\s+", ""); // Optional: Normalize input
        return IntStream.range(0, sanitized.length() / 2)
                .allMatch(i -> sanitized.charAt(i) == sanitized.charAt(sanitized.length() - i - 1));
    }
}
