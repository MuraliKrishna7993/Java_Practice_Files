package Dsa_Programs.sorting.cycleSort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CyclicSort_MissingNumber {
    public static void main(String[] args) {
        int[] arr= IntStream.of(1,2,0,4,3).toArray();
        int num=  MissingNumber(arr);
        System.out.println(num);
        System.out.println(Arrays.toString(arr));
    }

    private static int MissingNumber(int[] arr) {

        int i =0;
        while (i< arr.length){
            int correct= arr[i];

            if(arr[i]< arr.length &&  arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{i++;}
        }

        for(int j =0; j< arr.length;j++){
            if(arr[j] != j){
                return arr[j];
            }
        }
        return arr.length;
    }

    private static void swap(int[] arr, int ele, int position) {

        int temp= arr[ele];
        arr[ele]=arr[position];
        arr[position]= temp;
    }
}
