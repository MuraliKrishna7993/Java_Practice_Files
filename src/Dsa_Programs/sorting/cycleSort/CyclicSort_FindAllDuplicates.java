package Dsa_Programs.sorting.cycleSort;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/solutions/6934489/4-different-approaches-visual-walkthrough-including-o-n-time-o-1-space-solution/

public class CyclicSort_FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 2) {
                if (!result.contains(nums[i])) {
                    result.add(nums[i]);
                }
            }
        }

        return result;
    }
}
