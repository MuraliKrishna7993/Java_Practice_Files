package General_Programs.Lcm_Programs;

public class Lcm_rec {

    public static void main(String[] args) {
        System.out.println(lcm(72, 120));
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
