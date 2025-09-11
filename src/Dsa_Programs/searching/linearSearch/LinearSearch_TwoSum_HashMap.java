package Dsa_Programs.searching.linearSearch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class LinearSearch_TwoSum_HashMap {
    public static void main(String[] args) {
        int[] arr = IntStream.of(2, 5, 3, 7, 9).toArray();
        int tar = 16;

        System.out.println(Arrays.toString(twoSum(arr,tar)));
    }

    public static int[]  twoSum(int[] arr, int tar) {
        Map<Integer,Integer> res= new HashMap<>();

        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int compliment= tar-arr[i];
                if(res.containsKey(compliment))
                    return new int[]{res.get(compliment),i};
                else res.put(arr[i],i);
            }
        }
        return new int[]{};
    }
}
