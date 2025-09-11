package Task2.ExceptionDemo;

public class ArrayIndexOutofBoundsException {


    public static void main(String args[]) {
        try {
            int a[] = new int[5];
            a[0] = 5;
            a[1] = 15;
            a[2] = 25;
            a[3] = 35;
            a[4] = 45;
            a[5] = 55;

            for (int i = 0; i <= 5; i++) {
                System.out.println(a[i]);
            }

        } catch (Exception e) {
            System.out.println("Array Index is Out Of Bounds");
        }


    }


}
