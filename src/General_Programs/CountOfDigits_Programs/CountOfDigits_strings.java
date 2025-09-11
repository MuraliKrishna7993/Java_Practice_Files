package General_Programs.CountOfDigits_Programs;

public class CountOfDigits_strings {
    public static void main(String[] args) {
        int num = 67890;
        System.out.println(Count(num));


    }

    public static int Count(int num) {
        return String.valueOf(num).length();


    }
}
