package Task2.ListPractice;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        List<Integer> VD = new Vector<>();

        VD.add(1);
        VD.add(3);
        VD.add(2);
        VD.add(5);
        VD.add(4);

        VD.add(2);
        System.out.println("before removing" + VD);
        VD.remove(4);
        System.out.println("After removing 4 : " + VD);
        VD.set(2, 99);
        System.out.println("After updating with 2nd position : " + VD);
        System.out.println("iterating through iterator:");
        Iterator<Integer> i = VD.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }


    }

}
