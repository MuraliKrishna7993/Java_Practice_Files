package General_Programs.Fibonocci_Programs;

public class Fibonocci {
    public static void main(String[] args) {
        int num = 15;

        Fib(num);
    }

    public static void Fib(int num) {
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a + " " + b);
        for (int i = 2; i <= num; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }


    }

}