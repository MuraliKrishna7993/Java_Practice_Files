package General_Programs.Amstrong_Programs;

public class Amstrong_rec {
    public static void main(String[] args) {
        int num = 113;
        if (isAmstrong(num))
            System.out.println(num + " is amstrong");
        else
            System.out.println(num + " is not amstrong");

    }

    public static boolean isAmstrong(int num) {
        int pow = String.valueOf(num).length();
        return num == power(num, pow);
    }

    public static int power(int num, int pow) {
        if (num == 0)
            return 0;

        int rem = num % 10;
        return (int) (Math.pow(rem, pow) + power(num / 10, pow));
    }
}