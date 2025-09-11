package Task2.ListPractice;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class LinkedListDemo {

    public static void main(String[] args) {
        List<Integer> ll=new LinkedList<>();

        ll.add(1);
        ll.add(3);
        ll.add(2);
        ll.add(5);
        ll.add(4);
        ll.add(2);

        System.out.println("before removing" +ll);
        ll.remove(4);
        System.out.println("After removing 4 : " +ll);
        ll.set(2, 99);
        System.out.println("After updating with 2nd position : " +ll);
        System.out.println("iterating through iterator:");
        Iterator<Integer> i = ll.iterator();

        while(i.hasNext()) {
            System.out.println(i.next());
        }



    }

}


