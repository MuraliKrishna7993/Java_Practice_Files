package Task2.SessionPractice;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AlExceptionDemo {

    public static void main(String[] args) {
        List<Integer> al = new CopyOnWriteArrayList<>();

        al.add(6);
        al.add(16);
        al.add(26);
        al.add(36);
        al.add(46);

        System.out.println("ArrayList elements Before Deleting   :" + al);


        /*
         * for (Integer num : al) { if (num.equals(16)) { al.remove(num); } }
         *
         * System.out.println("ArrayList elements After Deleting   :" + al);
         */


        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            Integer num = itr.next();
            if (num.equals(16)) {
                al.remove((Object)46);
                al.add(106);
            }
        }
        System.out.println("ArrayList elements After Deleting   :" + al);

    }

}
