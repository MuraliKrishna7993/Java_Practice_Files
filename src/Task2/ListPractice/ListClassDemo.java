package Task2.ListPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Car {
    private String make;
    private String mode;
    private Double price;

    public Car(String make, String mode, Double price) {
        this.make = make;
        this.mode = mode;
        this.price = price;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("make : %s , mode : %s, price: %s ", make, mode, price);
    }


}

public class ListClassDemo {
    public static void main(String[] args) {

        List<Car> Cars = new ArrayList<>();

        Cars.add(new Car("Honda", "Civil", 2700000.00));
        Cars.add(new Car("Bmw", "Civil", 1700000.00));
        Cars.add(new Car("Scoda", "Civil", 3700000.00));
        Cars.add(new Car("Benz", "Civil", 4700000.00));


        Iterator<Car> i = Cars.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}

