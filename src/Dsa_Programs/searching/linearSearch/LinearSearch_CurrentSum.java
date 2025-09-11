package Dsa_Programs.searching.linearSearch;

import java.util.stream.IntStream;

public class LinearSearch_CurrentSum {
    public static void main(String[] args) {
        int[] arr = IntStream.of(-2,1,-3,4,-1,2,1,-5,4).toArray();
        System.out.println(currentSum(arr));
    }

    public static int currentSum(int[] arr){
        int maxSum=Integer.MIN_VALUE;

        int currentSum=0;

        for(int i=0;i< arr.length;i++){
            currentSum=currentSum+arr[i];

            if(currentSum>maxSum) maxSum=currentSum;
            if(currentSum<0) currentSum=0;
        }
        return maxSum;
    }
}