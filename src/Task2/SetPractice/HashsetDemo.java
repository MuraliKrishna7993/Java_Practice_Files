package Task2.SetPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetDemo {

    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(3);
        hs.add(2);
        hs.add(5);
        hs.add(4);

        hs.add(2);
        System.out.println("before removing" + hs);
        hs.remove(4);
        System.out.println("After removing 4 : " + hs);
        System.out.println("iterating through iterator:");
        Iterator<Integer> i = hs.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }

}
