package Array_Programs;

import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        System.out.println("Enter length of Array");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements into the array ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Printing elements in traditional way");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" " +System.lineSeparator());
        }

        System.out.println("Printing elements in new way");
        for (int j : arr) {
            System.out.print(j+" ");
        }
    }
}