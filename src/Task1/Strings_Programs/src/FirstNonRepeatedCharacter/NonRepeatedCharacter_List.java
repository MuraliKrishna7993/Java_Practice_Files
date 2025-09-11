package Task1.Strings_Programs.src.FirstNonRepeatedCharacter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class NonRepeatedCharacter_List {
    public static void main(String[] args) {

        System.out.println(nonRepeated("madamprswerer"));

    }

    public static List<Character> nonRepeated(String str){
        Map<Character,Integer> count= new LinkedHashMap<>();

        List<Character>  ke= new ArrayList<>();

        for (char c: str.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character,Integer> entry: count.entrySet()){
            if(entry.getValue() ==1){
                ke.add(entry.getKey());
            }
        }

        return ke;
    }
}

