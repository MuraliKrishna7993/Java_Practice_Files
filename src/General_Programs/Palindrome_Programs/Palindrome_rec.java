package General_Programs.Palindrome_Programs;

public class Palindrome_rec {
    public static void main(String[] args) {
        String name = "racecar";
        if (palindrome(name, 0, name.length() - 1)) {
            System.out.println("Given is palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    public static boolean palindrome(String name, int start, int end) {

        if (start > end) {
            return true;
        }

        if (name.toLowerCase().charAt(start) != name.toLowerCase().charAt(end)) {
            return false;
        }

        return palindrome(name, start + 1, end - 1);

    }
}