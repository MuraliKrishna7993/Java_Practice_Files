package General_Programs.Factorial_Programs;

public class Factorial_rec {
    public static void main(String[] args) {
        int num = 60;
        System.out.printf("Factorial of %d = %d%n", num, fact(num));
    }

    public static long fact(int num) {
        if (num <= 1)
            return 1;

        return num * fact(num - 1);
    }
}