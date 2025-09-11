package Task1.Strings_Programs.src.MaxOccuringCharacter;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuringCharacter_General {
    public static void main(String[] args) {
        System.out.println(occuringChar("madamsfbgvammmmmm"));
    }

    public static char occuringChar(String str){
        Map<Character,Integer> res= new HashMap<>();
        char[] chars= str.toCharArray();

        int value=0;
        char key=' ';

        for(char ch: chars){
            res.put(ch,res.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry: res.entrySet()){

            if(entry.getValue() > value){
                value=entry.getValue();
                key= entry.getKey();
            }
        }

        return key;

    }
}
