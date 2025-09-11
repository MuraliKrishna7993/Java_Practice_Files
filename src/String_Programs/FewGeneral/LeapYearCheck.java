package String_Programs.FewGeneral;

import java.util.Scanner;
public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int num = sc.nextInt();
        sc.close();

        if ((num % 4 == 0 && num % 100 != 0) || num % 400 == 0) {
            System.out.println("leap");
        } else {
            System.out.println("Not leap");
        }
    }
}
