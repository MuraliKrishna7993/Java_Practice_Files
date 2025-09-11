package General_Programs.Fibonocci_Programs;

public class Fibonocci_rec {
    public static void main(String[] args) {

        int num = 10;
        for (int i = 0; i < num; i++) {
            System.out.print(Fib(i) + " ");
        }
    }

    public static int Fib(int num) {
        if (num <= 1) {
            return num;
        }

        return Fib(num - 2) + Fib(num - 1);
    }

}

