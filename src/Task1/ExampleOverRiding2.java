package Task1;

class Bank {

    int getRateOfInterest() {

        return 0;

    }

}


class SBI extends Bank {

    @Override
    int getRateOfInterest() {

        return 8;

    }

}


class ICICI extends Bank {

    @Override
    int getRateOfInterest() {

        return 7;

    }

}


public class ExampleOverRiding2 {

    public static void main(String[] args) {

        Bank sbi = new SBI();

        Bank icici = new ICICI();

        System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest());

        System.out.println("ICICI Rate of Interest: " + icici.getRateOfInterest());

    }

}