package General_Programs.Factorial_Programs;

import static java.lang.System.*;

public class Factorial {

    public static void main(String[] args) {
        int num = 10;
        System.out.printf("Factorial_Programs.Factorial of %d = %d%n", num, fact(num));
    }

    public static long fact(int num) {
        long factNum = 1;
        for (int i = 1; i <= num; i++) {
            factNum = factNum * i;
        }
        return factNum;
    }
}
