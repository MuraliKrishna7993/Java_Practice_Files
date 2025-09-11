package Task3;

class Task1 implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("HI: " + i);
        }
    }

}

class Task2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("HELLO: " + i);
        }

    }
}

public class ThreadImplemtsDemo {

    public static void main(String[] args) {


        Runnable obj1 = new Task1();
        Runnable obj2 = new Task2();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();


        // new Thread(new Task1()).start();
        //new Thread( new Task2()).start();
    }

}

