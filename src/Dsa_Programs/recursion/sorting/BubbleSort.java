package Dsa_Programs.recursion.sorting;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = IntStream.of(4, 2, 3, 1).toArray();
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubble(int[] arr, int r, int c) {

        if (r == 0)
            return;

        if(c<r){
            if(arr[c]>arr[c+1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubble(arr,r,c+1);


        }else {
            bubble(arr,r-1,0);
        }


    }
}
