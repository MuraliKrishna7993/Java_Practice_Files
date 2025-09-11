package Dsa_Programs.searching.linearSearch;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LinearSearch_TwoSum_General {

    public static void main(String[] args) {
        int[] arr = IntStream.of(2, 5, 3, 7, 9).toArray();
        int tar = 7;

        System.out.println(Arrays.toString(twoSum(arr,tar)));
    }

    public static int[] twoSum(int[] arr, int tar) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] == tar - arr[i])
                    return new int[]{i, j};
            }
        }

        return new int[]{-1, -1};
    }
}
