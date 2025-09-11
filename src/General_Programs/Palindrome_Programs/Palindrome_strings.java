package General_Programs.Palindrome_Programs;

public class Palindrome_strings {
    public static void main(String[] args) {
        if (palindrome("Madam", "")) {
            System.out.println("Given is palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    public static boolean palindrome(String name, String rev) {

        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }

        if (name.equalsIgnoreCase(rev))
            return true;

        return false;

    }
}
