package Dsa_Programs.recursion.searching;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 66;
        System.out.println(binarySearch1(arr, target, 0, arr.length - 1));
    }

    static int binarySearch1(int[] arr, int target, int s, int e){

        if(s>e){
            return -1;
        }

        int m = s+(e-s)/2;

        if(arr[m]==target){
            return m;
        }

        if(target > arr[m]){
            return binarySearch1(arr,target,m+1,e);
        }
        return binarySearch1(arr,target,s,m-1);
    }
}