package String_Programs.VowelConsonantCounter;

import java.util.Scanner;

public class VowelConsonant_New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String input = sc.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (char c : input.toCharArray()) {

            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels " + vowels);

        System.out.println("Consonants " + consonants);
    }
}


