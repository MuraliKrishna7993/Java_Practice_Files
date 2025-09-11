package General_Programs.Prime_Programs;

public class PrimeOrNot_rec {
    public static void main(String[] args) {
        int num=2;
        if(isPrime(num,num/2)==1){
            System.out.println(num+ " is prime");}else {
            System.out.println(num+ " is not prime");}
    }

    public static int isPrime(int num,int div){
        if(div==1)
            return 1;
        else if (num%div==0) {
            return 0;
        }
        else return isPrime(num,div-1);
    }
}