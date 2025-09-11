package Task3;

class ATM {

    synchronized void WithdrawMoney(int numOfTimes, String UserName) {

        for (int i = 1; i <= numOfTimes; i++) {
            System.out.println("Withdrawing Money for " + UserName + " " + i + "Time");
        }
        System.out.println("\n Transacton Ended  for " + UserName + "\n");
    }
}


class User1 extends Thread {

    ATM atm1;

    User1(ATM atm1) {
        this.atm1 = atm1;
    }

    @Override
    public void run() {
        atm1.WithdrawMoney(5, "User1");
    }
}

class User2 extends Thread {

    ATM atm2;

    User2(ATM atm2) {
        this.atm2 = atm2;
    }

    @Override
    public void run() {
        atm2.WithdrawMoney(3, "User2");
    }
}


public class SynchronisedMethodDemo {

    public static void main(String args[]) {
        ATM obj = new ATM();
        User1 obj1 = new User1(obj);
        User2 obj2 = new User2(obj);
        obj1.start();
        obj2.start();

    }
}
 