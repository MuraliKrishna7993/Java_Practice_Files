package Task2.SessionPractice;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class HashmapException {

    public static void main(String[] args) {
        Map<String, String> Cars = new ConcurrentHashMap<String, String>();
        Cars.put("1", "Bmw");
        Cars.put("2", "Benz");
        Cars.put("3", "Ferrari");

        System.out.println("Before Deleting: " + Cars);


        Iterator<String> itr = Cars.keySet().iterator();

        while (itr.hasNext()) {
            String key = itr.next();
            if (key.equals("2")) {
                Cars.remove("1");
                Cars.put("4", "Lamborgini");
            }
        }


        System.out.println("After Deleting: " + Cars);

    }

}


