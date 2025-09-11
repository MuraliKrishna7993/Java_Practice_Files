package Task2.SetPractice;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Product{
    private String name;
    private String category;

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {

        return String.format("name:%s , category:%s" ,name,category);
    }

    @Override
    public boolean equals(Object other) {
        if(other == null)
        {
            return false;
        }

        if(!(other instanceof Product))
        {
            return false;
        }

        Product otherProduct = (Product) other;

        if(otherProduct.name.equals(this.name) && otherProduct.category.equals(this.category))
        {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(name,category);
    }


}

public class SetClassDemo {

    public static void main(String[] args) {

        Product phone = new Product("Iphone","Electronics");
        Product tv = new Product("Samsung","Electronics");
        Product shoes = new Product("Nike","FootWear");
        Product printer = new Product("Epson","Electronics");

        Set<Product> ProductSet= new HashSet<>();

        ProductSet.add(phone);
        ProductSet.add(tv);
        ProductSet.add(shoes);
        ProductSet.add(printer);

        System.out.println(ProductSet);

        System.out.println();


        System.out.println("***@@@***Add another Iphone***@@@***");

        Product another=new Product("Iphone","Electronics");

        ProductSet.add(another);

        System.out.println(ProductSet);


        System.out.println(phone.equals(another));

    }

}
