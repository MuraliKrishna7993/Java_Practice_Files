package Task1.Strings_Programs.src.PalindromeString;

public class PalindromeString_rec {
    public static void main(String[] args) {
        String name = "madam";
        System.out.println(palindromeString(name, 0, name.length() - 1));
    }

    public static boolean palindromeString(String str, int left, int right) {
        if (left >= right) {
            return true;
        } else if (str.charAt(left) != str.charAt(right)) {
            return false;
        } else {
            return palindromeString(str, left + 1, right - 1);
        }
    }
}
