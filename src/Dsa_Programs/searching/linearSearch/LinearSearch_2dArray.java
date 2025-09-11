package Dsa_Programs.searching.linearSearch;

import java.util.Arrays;

public class LinearSearch_2dArray {
    public static void main(String[] args) {

        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 9;

        System.out.println(Arrays.toString(search2D(arr,target)));
        System.out.println(search2d_2(arr,target));

    }

    public static int[] search2D(int[][] arr,int tar){
        if(arr.length==0){
            return new int[]{-1,-1};
        }

        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                if(arr[i][j]==tar){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }



    public static boolean search2d_2(int[][] arr, int tar){
        if(arr.length==0)
            return false;

        for (int i[] : arr){
            for (int j : i){
                if(j ==tar)
                    return true;

            }
        }
        return false;
    }
}

