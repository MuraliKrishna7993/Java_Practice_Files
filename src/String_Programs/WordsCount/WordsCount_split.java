package String_Programs.WordsCount;

import java.util.Arrays;

public class WordsCount_split {
    public static void main(String[] args) {

        String input = "Java is great and Java is fun.";
        String[] arr = input.split("\\s+ ");
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));


    }

}
