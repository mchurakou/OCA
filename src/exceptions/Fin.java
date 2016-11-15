package exceptions;

/**
 * Created by mikalai on 15.11.2016.
 */
public class Fin {

    public void go() {
        System.out.print("A");
        try {
            stop();
        } catch (ArithmeticException e) {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
        System.out.print("D");
    }
    public void stop() {
        System.out.print("E");
        Object x = null;
        x.toString();
        System.out.print("F");
    }
    public static void main(String[] args) {
        new Fin().go();
    }
}


