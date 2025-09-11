package General_Programs.Lcm_Programs;

public class Lcm_eucledian {
    public static void main(String[] args) {
        System.out.println(lcm(72, 120));
    }

    public static int gcd(int a, int b) {

        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
