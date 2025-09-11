package Task3;

import java.util.Scanner;

class AutomaticTeller {
    public void produce() {

        synchronized (this) {
            System.out.println("Transaction Started");
            System.out.println("Due to Insufficient Money Transaction has Paused");
            System.out.println("Waiting for Bank Response");

            try {
                wait();
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            System.out.println("Transaction Resumed");
        }
    }

    public void consume() {
        Scanner s = new Scanner(System.in);


        synchronized (this) {
            System.out.println("Bank is Responding");
            String opt = s.nextLine();

            if (opt.equals("yes")) {
                System.out.println("Money Deposited in ATM");
                notify();
            } else {
                System.out.println("Failed");
            }

        }
    }
}

class User implements Runnable {

    AutomaticTeller pc;

    public User(AutomaticTeller pc) {
        this.pc = pc;
    }

    @Override
    public void run() {

        pc.produce();
    }
}

class Bank implements Runnable {

    AutomaticTeller pc;

    public Bank(AutomaticTeller pc) {
        this.pc = pc;
    }

    @Override
    public void run() {

        pc.consume();
    }
}

public class InterThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        AutomaticTeller pc = new AutomaticTeller();
        User obj1 = new User(pc);
        Bank obj2 = new Bank(pc);

        Thread t1 = new Thread(obj1);

        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }

}