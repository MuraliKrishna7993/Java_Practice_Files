package General_Programs.Factorial_Programs;

import java.math.BigInteger;

public class Factorial_bigInt {
    public static void main(String[] args) {
        int num = 10;
        System.out.printf("Factorial of %d = %d%n", num, fact(num));
    }

    public static BigInteger fact(int num) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}