package Task1.Strings_Programs.src.ReverseWords;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWord_streams {
    public static void main(String[] args) {
        String input = "Java is great and Java is fun and Java is powerful";
        System.out.println(reverse(input));

    }

    public static String reverse(String str) {
        return Arrays.stream(str.split(" ")).map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
    }
}