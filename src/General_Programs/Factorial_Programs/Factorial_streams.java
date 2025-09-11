package General_Programs.Factorial_Programs;

import java.util.stream.LongStream;

public class Factorial_streams {
    public static void main(String[] args) {
        int num = 5;
        System.out.printf("Factorial of %d = %d%n", num, fact(num));
    }

    public static long fact(int num) {

        return LongStream.rangeClosed(1, num).reduce(1, (a, b) -> a * b);
    }
}
