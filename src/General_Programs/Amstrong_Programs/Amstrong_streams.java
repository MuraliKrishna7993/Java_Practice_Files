package General_Programs.Amstrong_Programs;



public class Amstrong_streams {
    public static void main(String[] args) {
        int num = 123;
        if (isAmstrong(num))
            System.out.println(num + " is amstrong");

        else System.out.println(num + " is not amstrong");
    }

    public static boolean isAmstrong(int num) {
        String pow = String.valueOf(num);

        int power = pow.length();
        int sum = pow.chars().map(Character::getNumericValue).map(dig -> (int) Math.pow(dig, power)).sum();

        return sum == num;
    }
}
