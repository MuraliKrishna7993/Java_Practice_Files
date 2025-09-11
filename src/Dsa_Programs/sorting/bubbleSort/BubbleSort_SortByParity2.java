package Dsa_Programs.sorting.bubbleSort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSort_SortByParity2 {
    public static void main(String[] args) {

        int[] arr= IntStream.of(4,2,5,7).toArray();

        System.out.println(Arrays.toString(byParity2(arr)));



    }

    public static int[] byParity2(int[] arr){
        int[] res= new int[arr.length];
        int even=0;
        int odd=1;

        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                res[even]=arr[i];
                even +=2;
            }else {
                res[odd]=arr[i];
                odd +=2;
            }
        }
        return res;
    }


}