package Task1.Strings_Programs.src.FirstNonRepeatedCharacter;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacter_streams {

    public static void main(String[] args) {
        frequencyCharacters("swiss");
    }

    public static  void frequencyCharacters(String str){
        Map<Character,Integer> fre= new HashMap<>();
        for (char c: str.toCharArray()){
            fre.put(c,fre.getOrDefault(c,0)+1);
        }
        for(char key: fre.keySet()){
            System.out.println(key+" : "+fre.get(key));
        }
    }
}