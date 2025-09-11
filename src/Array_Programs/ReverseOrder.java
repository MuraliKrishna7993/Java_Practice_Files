package Array_Programs;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        System.out.println("Enter size ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("printing elements in reverse order");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
