package Dsa_Programs.recursion.intro;

public class NumbersWithRecursion {

    public static void main(String[] args) {
        printNumber(1);
    }

    static  void printNumber(int n){
        if(n==5){
            System.out.println(n);
            return;

        }
        System.out.println(n);

        printNumber(n+1);
    }
}
