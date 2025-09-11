package Task1.Strings_Programs.src.PalindromeString;

public class PalindromeString_SB {
    public static void main(String[] args) {
        System.out.println(palindromeString("madaMfnfhjf"));
    }

    public static boolean palindromeString(String str) {
        String reverse = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(reverse))
            return true;

        return false;
    }
}