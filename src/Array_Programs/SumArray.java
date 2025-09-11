package Array_Programs;

import java.util.stream.IntStream;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = IntStream.rangeClosed(1, 9).toArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }
}
