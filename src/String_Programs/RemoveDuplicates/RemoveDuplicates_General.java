package String_Programs.RemoveDuplicates;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates_General {

    public static void main(String[] args) {
        String input = "Java is great and Java is fun and Java is powerful";
        System.out.println(remove(input));
    }

    public static String remove(String str) {
        String[] words = str.split("\\s+");
        Set<String> hash = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!hash.contains(word)) {

                hash.add(word);
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }


}
