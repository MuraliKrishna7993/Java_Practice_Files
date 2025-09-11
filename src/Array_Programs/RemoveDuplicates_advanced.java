package Array_Programs;

import java.util.*;

public class RemoveDuplicates_advanced {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 4, 3, 5, 6, 4};
        Arrays.sort(arr);
        int[] result1 = usingList(arr);
        int[] result2 = usingSet(arr);
        int[] result3 = usingLinkedHashset(arr);
        int[] result4 = usingStreams(arr);

        System.out.println("using List");
        for (int j : result1) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("using Set");
        for (int j : result2) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("using LinkedHashSet");
        for (int j : result3) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("using Streams");
        for (int j : result4) {
            System.out.print(j + " ");
        }
        System.out.println();


    }

    public static int[] usingList(int[] arr) {

        List<Integer> resp = new ArrayList<>();
        for (int i : arr) {
            if (!resp.contains(i)) {
                resp.add(i);
            }
        }
        return resp.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] usingSet(int[] arr) {
        Set<Integer> resp2 = new HashSet<>();
        for (int i : arr) {
            resp2.add(i);
        }
        return resp2.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] usingLinkedHashset(int[] arr) {
        Set<Integer> resp3 = new LinkedHashSet<>();
        for (int i : arr) {
            resp3.add(i);
        }
        return resp3.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] usingStreams(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }
}
