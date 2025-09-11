package Dsa_Programs.sorting.selectionSort;

import java.util.Arrays;

public class SelectionSort_General {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i -1;

            int max = findMax(arr, 0, last);
            swap(arr, max, last);
        }

    }

    private static void swap(int[] arr, int max, int last) {
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }

    private static int findMax(int[] arr, int start, int last) {

        int high = start;
        for (int i = start; i <= last; i++) {


            if (arr[high] < arr[i]) {
                high = i;
            }
        }
        return high;
    }
}
