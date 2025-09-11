package General_Programs.Gcd_Programs;

public class Gcd_eucledian {
    public static void main(String[] args) {
        System.out.println(gcdEuclidean(93, 177));
    }

    public static int gcdEuclidean(int n1, int n2) {
        while (n2 != 0) {
            int remainder = n1 % n2;
            n1 = n2;
            n2 = remainder;
        }
        return n1;
    }
}
