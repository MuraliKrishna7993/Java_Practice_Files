package Task3;

class AtmMachine {

    void WithdrawMoney(int numOfTimes, String UserName) {
        synchronized (this) {
            for (int i = 1; i <= numOfTimes; i++) {
                System.out.println("Withdrawing Money for " + UserName + " " + i + "Time");
            }
        }

        System.out.println("\n Transacton Ended  for " + UserName + "\n");
    }
}


class User_1 extends Thread {

    AtmMachine atm1;

    User_1(AtmMachine atm1) {
        this.atm1 = atm1;
    }

    @Override
    public void run() {
        atm1.WithdrawMoney(5, "User1");
    }
}

class User_2 extends Thread {

    AtmMachine atm2;

    User_2(AtmMachine atm2) {
        this.atm2 = atm2;
    }

    @Override
    public void run() {
        atm2.WithdrawMoney(3, "User2");
    }
}

class User_3 extends Thread {

    AtmMachine atm3;

    User_3(AtmMachine atm3) {
        this.atm3 = atm3;
    }

    @Override
    public void run() {
        atm3.WithdrawMoney(8, "User3");
    }
}

public class SynchronisedBlockDemo {

    public static void main(String args[]) {
        AtmMachine obj = new AtmMachine();
        User_1 obj1 = new User_1(obj);
        User_2 obj2 = new User_2(obj);
        User_3 obj3 = new User_3(obj);
        obj1.start();
        obj2.start();
        obj3.start();
    }
}
