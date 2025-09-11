package General_Programs.Reverse_Programs;

public class Reverse {
    public static void main(String[] args) {
        int number = 12345; // Example number

        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + rev(number));
    }

    public static int rev(int num) {
        int rem = 0;
        int rev = 0;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;


        }
        return rev;
    }
}
