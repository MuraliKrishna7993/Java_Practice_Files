package Task2.MapPractice;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
        hm.put(1202, "Titanic");
        hm.put(1203, "Jaws");
        hm.put(1501, "Back to the future");
        hm.put(1702, "Titanic");

        System.out.println("*********************");

        System.out.println("Without iteration:   " + hm);

        System.out.println();

        System.out.println("*********************");

        System.out.println("Using iteration one way");

        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());

        System.out.println();

        System.out.println("*********************");
        System.out.println("2nd Way");

        Set<Map.Entry<Integer, String>> entry0 = hm.entrySet();
        for (Map.Entry<Integer, String> entry1 : entry0) {
            System.out.println("Key: " + entry1.getKey() + "Value: " + entry1.getValue());
        }

        System.out.println();

        System.out.println("*********************");
        System.out.println("updation");

        Set<Map.Entry<Integer, String>> entry2 = hm.entrySet();

        for (Map.Entry<Integer, String> entry3 : entry2) {
            if (entry3.getKey() == 1501) {
                entry3.setValue("God Father");
            }
        }

        System.out.println("After updating" + hm);

        System.out.println();

        System.out.println("*********************");


        System.out.println("After updating anotherWay");
        hm.put(1202, "Billa");
        System.out.println(hm);

        System.out.println("*********************");

        System.out.println();

        System.out.println("*********************");

        System.out.println("After removing ");

        hm.remove(1203);

        System.out.println(hm);

        System.out.println("*********************");

        System.out.println("Fetching 1202 value:" + hm.get(1202));

        System.out.println("*********************");

        Set<Integer> keys = hm.keySet();
        System.out.println("key set: " + keys);

        System.out.println("*********************");

        Collection<String> values = hm.values();

        System.out.println(values);

    }


}



