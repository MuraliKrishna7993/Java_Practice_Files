package Dsa_Programs.searching.linearSearch;

import java.util.stream.IntStream;

public class LinearSearch_General {

    public static void main(String[] args) {
        int[] arr = IntStream.of(1, 5, 3, 7, 9, 2).toArray();
        int target = 4;

        System.out.println(linearSearch1(arr, target));
        System.out.println(linearSearch2(arr, target));
        System.out.println(linearSearch3(arr, target));


    }
    private static int linearSearch3(int[] arr, int target) {

        if (arr.length <= 0)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return arr[i];
        }
        return Integer.MAX_VALUE;
    }

    private static int linearSearch2(int[] arr, int target) {

        if (arr.length <= 0)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    private static boolean linearSearch1(int[] arr, int target) {

        if (arr.length <= 0)
            return false;

        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }

        return false;
    }


}
