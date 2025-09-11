package General_Programs.CountOfDigits_Programs;

public class CountOfDigits {
    public static void main(String[] args) {
        System.out.println(count(1234918));
    }

    public static int count(long num) {
        int count = 0;

        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}