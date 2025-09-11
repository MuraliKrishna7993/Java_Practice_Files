package Array_Programs;

import java.util.stream.IntStream;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = IntStream.of(1, 4, 2, 7, 3, 2).toArray();
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}