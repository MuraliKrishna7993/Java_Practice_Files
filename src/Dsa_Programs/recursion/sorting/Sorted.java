package Dsa_Programs.recursion.sorting;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 5, 16, 18};
        System.out.println(sorted(arr, 0));
    }

    private static boolean sorted(int[] arr, int i) {
        if(i == arr.length-1){
            return true;
        }

        return arr[i]<arr[i+1] && sorted(arr,i+1);
    }
}