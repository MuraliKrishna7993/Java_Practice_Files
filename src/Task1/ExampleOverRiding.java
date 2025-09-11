package Task1;

class SuperClassA {
    public void methodA() {
        System.out.println("Hello World");
    }
}

interface InterfaceA {

    public void interfaceMethodA();

}


public class ExampleOverRiding extends SuperClassA implements InterfaceA {
    @Override
    public void methodA() {
        /* super.methodA(); */
        System.out.println("hello world! Im from sub class");
    }

    @Override
    public void interfaceMethodA() {
        System.out.println("hello world! Im from sub class InterfaceMethodA");
    }


    public static void main(String[] args) {
        ExampleOverRiding s1 = new ExampleOverRiding();

        ;
        s1.methodA();
        s1.interfaceMethodA();
    }
}



