package Task3;

class Hi extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("HI: " + i);
        }
    }

}

class Hello extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("HELLO: " + i);
        }

    }
}

public class ThreadExtendsDemo {

    public static void main(String[] args) {

        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start();
        obj2.start();
    }

}
 