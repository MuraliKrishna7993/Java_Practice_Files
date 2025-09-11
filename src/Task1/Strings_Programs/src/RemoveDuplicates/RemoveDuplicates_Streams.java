package Task1.Strings_Programs.src.RemoveDuplicates;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicates_Streams {
    public static void main(String[] args) {
        String input = "Java is great and Java is fun and Java is powerful";
        System.out.println(remove(input));
    }

    public static String remove(String str){
        return Arrays.stream(str.split("\\s+")).distinct().collect(Collectors.joining(" "));
    }
}
