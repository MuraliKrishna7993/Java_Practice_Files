package Task1.Strings_Programs.src.WordsCount;

public class SubStringCount_split {
    public static void main(String[] args) {
        String input = "Java is great and Java is fun.";
        String sub = "Java";
        String[] arr = input.split(sub, -1);
        System.out.println(arr.length - 1);
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
