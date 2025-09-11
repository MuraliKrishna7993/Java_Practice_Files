package Dsa_Programs.searching.linearSearch;

public class LinearSearch_Strings {
    public static void main(String[] args) {

        String S= "Murali";
        char tar= 'k';

        System.out.println(search(S,tar));
        System.out.println(search2(S,tar));
    }

    public static boolean search(String s, char target) {
        if (s.length() <= 0)
            return false;

        for (char ch : s.toCharArray()) {
            if (ch == target)
                return true;
        }

        return false;

    }

    public static boolean search2(String s, char tar) {
        if (s.length() == 0)
            return false;

        for (int i = 0; i < s.length(); i++) {
            if (tar == s.charAt(i))
                return true;
        }

        return false;
    }
}
