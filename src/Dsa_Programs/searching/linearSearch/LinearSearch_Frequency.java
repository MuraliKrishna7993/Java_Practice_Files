package Dsa_Programs.searching.linearSearch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class LinearSearch_Frequency {
    public static void main(String[] args) {
        int[] arr = IntStream.of(2, 0, 1,0, 1, 2).toArray();
        System.out.println(Arrays.toString(frequency(arr)));

    }

    public static int[] frequency(int[] arr){
        Map<Integer,Integer> count= new HashMap<>();

        count.put(0,0);
        count.put(1,0);
        count.put(2,0);

        int idx=0;

        for(int ele: arr)
        {
            count.put(ele, count.get(ele) + 1);
        }

        for (int color=0;color < 3 ;color++){
            int fre= count.get(color);
            for (int j=0;j< fre;j++){
                arr[idx]= color;
                idx++;
            }
        }

        return arr;
    }
}