package Array_Programs;

public class LargestNumber {
    public static void main(String[] args) {
        int[] array = {5, 8, 123, 12, 45, 89};

        System.out.println(largest(array));
    }

    public static int largest(int[] arr) {
        int largest = arr[0];

        for (int i : arr) {
            if (i > largest) {
                largest = i;
            }
        }

        return largest;
    }
}
