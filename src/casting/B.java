package casting;

/**
 * Created by mikalai on 27.10.2016.
 */
public class B extends A {


    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        A aa = b;
        B bb= (B)a;
    }
}
