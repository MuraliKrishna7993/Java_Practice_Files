package Task1;

// Java program to demonstrate
// method Hiding in java
// Base Class
class Complex {
  public static void f1()
  {
  System.out.println("f1 method of the Complex class is executed.");
 }
}



// class child extend Demo class
class Sample extends Complex {
 public static void f1()
 {
 System.out.println( "f1 of the Sample class is executed.");
 }
}
public class ExampleOverHiding2 {



 public static void main(String args[])
 {
 Complex d1 = new Complex();



 // d2 is reference variable of class Demo that
 // points to object of class Sample
 Complex d2 = new Sample();



 // But here method will be call using type of
 // reference
 d1.f1();
 d2.f1();
 }
}