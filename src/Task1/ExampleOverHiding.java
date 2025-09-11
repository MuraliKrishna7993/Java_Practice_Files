package Task1;

class SuperHiding {
    public static void MethodA() {
        System.out.println("methodA of super class");
    }
}


public class ExampleOverHiding extends SuperHiding {
    public static void MethodA() {

        System.out.println("methodA of sub class");
    }

    public static void MethodB() {
        System.out.println("methodB of sub class");
    }

    public static void main(String args[]) {

        ExampleOverHiding s2 = new ExampleOverHiding();


        s2.MethodA();
        s2.MethodB();
    }
}