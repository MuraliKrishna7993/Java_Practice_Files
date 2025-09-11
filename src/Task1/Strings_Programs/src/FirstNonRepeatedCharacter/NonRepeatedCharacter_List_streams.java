package Task1.Strings_Programs.src.FirstNonRepeatedCharacter;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharacter_List_streams {
    public static void main(String[] args) {
        String input = "swiss";


        System.out.println(firstNon(input));


    }

    public static List<Character> firstNon(String str) {
        return (List<Character>) str.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i -> i.getValue() == 1)
                .map(i -> i.getKey()).collect(Collectors.toList());

    }
}