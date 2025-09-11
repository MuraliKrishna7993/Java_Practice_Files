package Task1.Strings_Programs.src.RemoveDuplicates;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates_Linked {
    public static void main(String[] args) {
        String input = "Java is great and Java is fun and Java is powerful";
        System.out.println(remove(input));
    }

    public static String remove(String str){
        String[] words= str.split("\\s+");

        Set<String> se= new LinkedHashSet<>(Arrays.asList(words));

        String res= String.join(" ",se);

        return res;
    }
}