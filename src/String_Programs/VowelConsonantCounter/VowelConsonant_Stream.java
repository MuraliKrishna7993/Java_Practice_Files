package String_Programs.VowelConsonantCounter;

import java.util.Scanner;

public class VowelConsonant_Stream {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String input=sc.nextLine().toLowerCase();

        int vowels= (int) input.chars().filter(c-> "aeiou".indexOf(c) != -1).count();

        int con= (int) input.chars().filter(c->"aeiou".indexOf(c) == -1).count();

        System.out.println("Vowels "+vowels+" and "+ "Consonants "+con);


    }
}
