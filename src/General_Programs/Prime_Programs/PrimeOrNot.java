package General_Programs.Prime_Programs;

public class PrimeOrNot {
    public static void main(String[] args) {
        int num= 29;
        System.out.println(num+" is " + (isPrime(num) ? " prime ":" not "));
    }


    public static boolean isPrime(int num) {
        if(num<=1)
            return false;

        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
