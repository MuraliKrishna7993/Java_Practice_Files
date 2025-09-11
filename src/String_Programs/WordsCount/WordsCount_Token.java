package String_Programs.WordsCount;

import java.util.StringTokenizer;

public class WordsCount_Token {
    public static void main(String[] args) {
        String input = "Java is great and Java is fun.";

        StringTokenizer token= new StringTokenizer(input);
        int count= token.countTokens();
        System.out.println(count);





    }
}