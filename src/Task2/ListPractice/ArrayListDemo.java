package Task2.ListPractice;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Integer> AL=new ArrayList<>();

        AL.add(1);
        AL.add(3);
        AL.add(2);
        AL.add(5);
        AL.add(4);

        AL.add(2);
        System.out.println("before removing" +AL);
        AL.remove(4);
        System.out.println("After removing 4 : " +AL);
        AL.set(2, 99);
        System.out.println("After updating with 2nd position : " +AL);
        System.out.println("iterating through iterator:");
        Iterator<Integer> i = AL.iterator();

        while(i.hasNext()) {
            System.out.println(i.next());
        }



    }

}


