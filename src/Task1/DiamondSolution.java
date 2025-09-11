package Task1;
//DIAMOND PROBLEM SOLUTION IN JAVA8


interface Interface1 {
    public default void show() {
        System.out.println("Im From Interface1 show()");
    }
}


interface Interface2 {
    public default void show() {
        System.out.println("Im From Interface2 show()");
    }
}


public class DiamondSolution implements Interface1, Interface2 {

    public void show() {
        Interface1.super.show();
        Interface2.super.show();
        System.out.println("Im from DiamondDemo class");
    }

    public static void main(String args[]) {
        DiamondSolution obj = new DiamondSolution();
        obj.show();
    }

}






