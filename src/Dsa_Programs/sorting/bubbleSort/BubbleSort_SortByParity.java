package Dsa_Programs.sorting.bubbleSort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSort_SortByParity {

    public static void main(String[] args) {

        int[] arr= IntStream.of(2,1,3,5,4,8,7).toArray();
        byParity(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void byParity(int[] arr){
        int left=0;

        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                int temp= arr[left];
                arr[left]=arr[i];
                arr[i]=temp;
                left++;
            }
        }

    }
}



