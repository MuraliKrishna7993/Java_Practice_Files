package General_Programs.CountOfDigits_Programs;

public class CountOfDigits_rec {
    public static void main(String[] args) {
        System.out.println(Count(678));
    }

    public static int Count(int num) {
        if (num == 0)
            return 0;

        return 1 + Count(num / 10);
    }
}