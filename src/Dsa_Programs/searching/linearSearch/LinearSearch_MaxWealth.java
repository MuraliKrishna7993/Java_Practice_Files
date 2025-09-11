package Dsa_Programs.searching.linearSearch;

public class LinearSearch_MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 4, 1},
                {8, 12, 3, 9},
                {8, 9, 34, 6},
                {18, 12}
        };
        int max = 0;

        System.out.println(maxWealth(arr, max));
    }

    public static int maxWealth(int[][] arr, int max) {
        for (int[] row : arr) {
            int sum = 0;
            for (int ele : row) {
                sum = sum + ele;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
