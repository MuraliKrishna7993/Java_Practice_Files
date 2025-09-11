package Task1.Strings_Programs.src.FirstNonRepeatedCharacter;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter_general {
    public static void main(String[] args) {
        String input = "swiss";

        char res = firstNon(input);

        if (res != '0') {
            System.out.println("The first non-repeated character is: " + res);
        } else {
            System.out.println("No non repeated character");
        }
    }

    public static char firstNon(String str) {
        Map<Character, Integer> count = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {

            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '0';
    }
}

