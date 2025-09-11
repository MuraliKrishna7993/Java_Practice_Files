package General_Programs.Palindrome_Programs;

public class Palindrome_number {
    public static void main(String[] args) {
        if (palindrome(121, 0)) {
            System.out.println("Given is palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }  public static boolean palindrome(int num, int rev) {
        int rem = 0;
        int num2 = num;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (num2 == rev) {
            return true;
        }

        return false;
    }
}