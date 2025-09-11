package Task3;

public class UsingLamda {

    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("HELLO: " +i);
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("HI: " +i);
            }
        };

        new Thread(obj1).start();
        new Thread(obj2).start();

    }

}
