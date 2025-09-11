package General_Programs.SumOfDigits_Programs;

public class SumOfDigits_streams {
    public static void main(String[] args) {
        System.out.println(sumDigits(7890));
    }

    public static int sumDigits(int num) {
        return (int) String.valueOf(num).chars().map(Character::getNumericValue).sum();
    }
}
