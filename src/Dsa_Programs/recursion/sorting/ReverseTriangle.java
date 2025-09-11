package Dsa_Programs.recursion.sorting;

public class ReverseTriangle {
    public static void main(String[] args) {
        reverse(4, 0);
    }

    private static void reverse(int r, int c) {

        if (r == 0) {
            return;
        }

        if (c < r) {
            System.out.print(" * ");
            reverse(r, c + 1);
        } else {
            System.out.println();
            reverse(r - 1, 0);
        }
    }
}
