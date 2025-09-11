package General_Programs.SumOfDigits_Programs;

public class SumOfDigits_rec {
    public static void main(String[] args) {

        System.out.println(sumdigits(7890));
    }

    public static int sumdigits(int num) {

        if (num == 0)
            return 0;

        return num % 10 + sumdigits(num / 10);

    }
}