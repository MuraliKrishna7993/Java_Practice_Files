package General_Programs.Palindrome_Programs;

public class Palindrome_sbuilder {

    public static void main(String[] args) {
        if (palindrome("Madamdggfh", "")) {
            System.out.println("Given is palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }


    public static boolean palindrome(String name, String rev) {

        rev = new StringBuilder(name).reverse().toString();

        if (name.equalsIgnoreCase(rev)) return true;

        return false;

    }
}
