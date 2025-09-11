package General_Programs.Reverse_Programs;

public class Reverse_string {
    public static void main(String[] args) {
        System.out.println(rev(12345));
    }

    public static String rev(int num) {
        return new StringBuilder(String.valueOf(num)).reverse().toString();
    }
}