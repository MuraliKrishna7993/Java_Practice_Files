package Dsa_Programs.sorting.bubbleSort;

import java.util.stream.IntStream;

public class BubbleSort_RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr= IntStream.of(1,1,2).toArray();
        System.out.println(removeDuplicates(arr));

    }

    public static int removeDuplicates(int[] arr){
        int left=1;

        for(int i=1;i< arr.length;i++){
            if(arr[i] != arr[left-1]){
                arr[left] = arr[i];
                left ++;
            }
        }
        return left;
    }
}
