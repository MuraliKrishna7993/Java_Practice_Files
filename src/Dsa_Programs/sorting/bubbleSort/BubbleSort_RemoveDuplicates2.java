package Dsa_Programs.sorting.bubbleSort;

import java.util.stream.IntStream;

public class BubbleSort_RemoveDuplicates2 {
    public static void main(String[] args) {
        int[] arr= IntStream.of(0,0,1,1,1,1,2,3,3).toArray();
        System.out.println(removeDuplicates(arr));

    }

    public static int removeDuplicates(int[] arr){
        int left=2;

        for(int i=2;i< arr.length;i++){
            if(arr[i] != arr[left-2]){
                arr[left] = arr[i];
                left ++;
            }
        }
        return left;
    }
}
