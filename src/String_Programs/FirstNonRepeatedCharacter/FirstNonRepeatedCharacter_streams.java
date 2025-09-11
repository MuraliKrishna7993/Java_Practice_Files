package String_Programs.FirstNonRepeatedCharacter;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter_streams {
    public static void main(String[] args) {
        String input = "swiss";


        System.out.println(firstNon(input));


    }

    public static char firstNon(String str) {
        return str.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i -> i.getValue() == 1)
                .map(i -> i.getKey()).findFirst().orElse(null);

    }
}
