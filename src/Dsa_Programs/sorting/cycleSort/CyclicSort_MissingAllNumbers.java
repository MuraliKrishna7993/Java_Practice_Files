package Dsa_Programs.sorting.cycleSort;

import java.util.ArrayList;
import java.util.List;

public class CyclicSort_MissingAllNumbers {
    public static void main(String[] args) {
        int[] arr= {1,8,5,9,3};

        System.out.println(missingAllNumbers(arr));
    }

    private static List<Integer> missingAllNumbers(int[] arr) {

        int i=0;

        while (i< arr.length){
            int pos= arr[i]-1;

            if(arr[i] < arr.length && arr[i] != arr[pos]){
                swap(arr,i,pos);
            }else {i++;}
        }
        List<Integer> elements= new ArrayList<>();
        for (int j=0;j< arr.length;j++){

            if(arr[j] != j){
                elements.add(j+1);
            }
        }
        return elements;
    }



    private static void swap(int[] arr, int ele, int position) {

        int temp= arr[ele];
        arr[ele]=arr[position];
        arr[position]= temp;
    }

}
