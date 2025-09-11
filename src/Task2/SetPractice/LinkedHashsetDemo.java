package Task2.SetPractice;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetDemo {

    public static void main(String[] args) {
        Set<String> hs= new LinkedHashSet<>();
        hs.add("world");
        hs.add("hello");
        hs.add("murali");
        hs.add("is");
        hs.add("this");

        hs.add("is");
        System.out.println("before removing" +hs);
        hs.remove("murali");
        System.out.println("After removing murali :" +hs);
        System.out.println("iterating through iterator:");
        Iterator<String> i = hs.iterator();

        while(i.hasNext()) {
            System.out.println(i.next());
        }

    }


}


