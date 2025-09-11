package Task3;
class TaskA{
    public void Show() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("HI: " +i);
        }
    }
}
class TaskB{
    public void Display() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("HELLO: " +i);
        }
    }
}
public class SequentialDemo {
    public static void main(String[] args) {

        TaskA obj1 = new TaskA();
        TaskB obj2= new TaskB();

        obj1.Show();
        obj2.Display();
    }
}

