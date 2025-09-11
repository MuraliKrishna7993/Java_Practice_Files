package General_Programs.SumOfDigits_Programs;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(7890));
    }

    public static int sumDigits(int num) {
        int sum = 0;

        int rem = 0;
        while (num != 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;
    }
}