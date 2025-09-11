package General_Programs.Prime_Programs;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeOrNot_streams {
    public static void main(String[] args) {
        int num = 29;
        System.out.println("Given num " + num + " is " + ((isPrime(num) ? "Prime" : "Not Prime")));
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        else {
            return IntStream.rangeClosed(2, (int) Math.sqrt(num)).noneMatch(i -> num % i == 0);
        }
    }

}