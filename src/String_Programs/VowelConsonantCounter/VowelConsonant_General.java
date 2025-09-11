package String_Programs.VowelConsonantCounter;

import java.util.Scanner;

public class VowelConsonant_General {
    public static void main(String[] args) {
        int vowels=0; int consonants=0;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String...");
        String input= sc.nextLine().toLowerCase();

        for(int i=0;i<input.length();i++){
            char ch= input.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
                    vowels++;
                }else {
                    consonants++;
                }
            }


        }

        System.out.println("vowels count "+vowels);

        System.out.println("consonants count "+consonants);
    }
}
