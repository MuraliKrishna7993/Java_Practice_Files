package General_Programs.Amstrong_Programs;

public class Amstrong_Number {

    public static void main(String[] args) {
        int num = 9474;
        if (isAmstrong(num))
            System.out.println(num + " is amstrong");

        else {
            System.out.println(num + " is not amstrong");
        }
// second Commit
    }

    public static boolean isAmstrong(int num) {
        int num2 = num;
        int pow = String.valueOf(num2).length();
        int ams = 0;

        while (num != 0) {
            int rem = num % 10;
            ams = (int) (ams + Math.pow(rem, pow));
            num = num / 10;
        }

        return num2 == ams;

    }
}