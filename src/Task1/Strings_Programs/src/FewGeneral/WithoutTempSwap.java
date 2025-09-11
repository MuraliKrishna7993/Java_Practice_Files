package Task1.Strings_Programs.src.FewGeneral;

public class WithoutTempSwap {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";


        System.out.println("before Swap " + str1 + " " + str2);
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("after Swap " + str1 + " " + str2);
    }
}