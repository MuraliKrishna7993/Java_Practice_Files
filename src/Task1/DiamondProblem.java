package Task1;
//DIAMOND PROBLEM BEFORE JAVA8

class ClassA {
    public void show() {
        System.out.println("Im From classA show()");
    }
}


class ClassB extends ClassA {
    public void show() {
        System.out.println("Im From classB show()");
    }
}


class ClassC extends ClassA {
    public void show() {
        System.out.println("Im From classC show()");
    }
}


/*
public class DiamondProblem extends ClassB, ClassC {

    public static void main(String args[]) {
        DiamondProblem d = new DiamondProblem();
        d.show();
    }
}*/









