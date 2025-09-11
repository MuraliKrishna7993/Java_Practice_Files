package Task2.ListPractice;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<Integer> SK= new Stack<>();
        SK.push(1);
        SK.push(7);
        SK.push(3);
        SK.push(8);
        SK.push(9);
        SK.push(2);
        System.out.println("Before pop" +SK);
        SK.pop();
        System.out.println("After Pop" +SK);
        System.out.println("After Peek" +SK.peek());
        System.out.println("After Peek" +SK);
    }

}
