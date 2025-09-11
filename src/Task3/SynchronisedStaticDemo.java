package Task3;

class Atm1 {

    synchronized static void WithdrawMoney(int numOfTimes, String UserName) {

        for (int i = 1; i <= numOfTimes; i++) {
            System.out.println("Withdrawing Money for " + UserName + " " + i + "Time");
        }
        System.out.println("\n Transacton Ended  for " + UserName + "\n");
    }
}


class Customer1 extends Thread {


    @Override
    public void run() {
        Atm1.WithdrawMoney(5, "User1");
    }
}

class Customer2 extends Thread {

    @Override
    public void run() {
        Atm1.WithdrawMoney(3, "User2");
    }
}


public class SynchronisedStaticDemo {

    public static void main(String args[]) {

        Customer1 obj1 = new Customer1();
        Customer2 obj2 = new Customer2();
        obj1.start();
        obj2.start();

    }
}



