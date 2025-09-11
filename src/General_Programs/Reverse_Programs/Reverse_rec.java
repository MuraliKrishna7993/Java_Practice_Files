package General_Programs.Reverse_Programs;

public class Reverse_rec {
    public static void main(String[] args) {
        System.out.println(rec(54321, 0));
    }

    public static int rec(int num, int rev) {

        if (num == 0)
            return rev;


        return rec(num / 10, rev * 10 + num % 10);

    }
}