package Dsa_Programs.sorting.cycleSort;

import java.util.Arrays;



public class CyclicSort_General {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {

        int i =0;

        while(i< arr.length){
            int correct=arr[i] - 1;

            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int ele, int position) {

        int temp= arr[ele];
        arr[ele]=arr[position];
        arr[position]= temp;
    }


}