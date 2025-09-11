package Task1.Strings_Programs.src.PalindromeString;

public class PalindromeString_General {

    public static void main(String[] args) {
        System.out.println(palindromeString("madamsfbgva"));
    }

    public static boolean palindromeString(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
