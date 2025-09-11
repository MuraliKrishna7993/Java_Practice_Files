package String_Programs.ReverseWords;

public class ReverseWord_General {

    public static void main(String[] args) {

        String input = "Java is great and Java is fun and Java is powerful";
        System.out.println(reverse(input));
    }

    public static String reverse(String str){

        String[] words= str.split("\\s+");

        StringBuilder res= new StringBuilder();

        for (String word: words){
            res.append(new StringBuilder(word).reverse().append(" "));
        }
        return res.toString().trim();
    }
}
