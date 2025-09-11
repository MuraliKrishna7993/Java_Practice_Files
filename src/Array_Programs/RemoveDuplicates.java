package Array_Programs;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 4, 3, 5, 6, 4};
        Arrays.sort(arr);
        int size = Remove(arr);

        System.out.println(size);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int Remove(int[] arr) {
        int j = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
}
