package General_Programs.CountOfDigits_Programs;

public class CountOfDigits_streams {
    public static void main(String[] args) {
        System.out.println(countDigits(78901234));
    }

    public static int countDigits(int num) {

        return (int) String.valueOf(num).chars().count();

    }
}