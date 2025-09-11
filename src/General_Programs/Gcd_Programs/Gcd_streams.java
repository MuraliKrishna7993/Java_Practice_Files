package General_Programs.Gcd_Programs;

import java.util.stream.IntStream;

public class Gcd_streams {
    public static void main(String[] args) {
        System.out.println(gcdStream(81, 153));
    }

    public static int gcdStream(int a, int b) {
        return IntStream.rangeClosed(1, Math.min(a, b)).filter(i -> a % i == 0 && b % i == 0).max().orElse(1);
    }
}