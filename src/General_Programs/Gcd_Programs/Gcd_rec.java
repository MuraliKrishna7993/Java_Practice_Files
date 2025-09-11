package General_Programs.Gcd_Programs;

public class Gcd_rec {
    public static void main(String[] args) {
        System.out.println(gcdRec(81, 153));
    }

    public static int gcdRec(int a, int b) {
        if (b == 0)
            return a;

        return gcdRec(b, a % b);
    }
}