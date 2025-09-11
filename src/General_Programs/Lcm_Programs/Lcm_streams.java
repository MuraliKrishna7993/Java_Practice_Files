package General_Programs.Lcm_Programs;

import java.util.stream.IntStream;

public class Lcm_streams {
    public static void main(String[] args) {
        System.out.println(lcm(72, 120));
    }

    public static int lcm(int a, int b) {
        return IntStream.iterate(Math.max(a, b), i -> i + Math.max(a, b)).filter(i -> i % a == 0 && i % b == 0).findFirst().orElseThrow();
    }
}
