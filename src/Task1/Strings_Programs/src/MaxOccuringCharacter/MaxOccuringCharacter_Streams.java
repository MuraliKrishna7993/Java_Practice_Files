package Task1.Strings_Programs.src.MaxOccuringCharacter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxOccuringCharacter_Streams {

    public static void main(String[] args) {
        maxChar("madamsfbgvammmmmmaaaaaaaaaaaaaaaaaaaaaaaaafgdghmhnsddf");
    }

    public static void maxChar(String str) {
        str.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(entry ->
                        System.out.println("Maximum occurring character: " + entry.getKey() + " with count: " + entry.getValue()));

    }
}

