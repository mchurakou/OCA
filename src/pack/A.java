package pack;
import pack.b.*;

public class A {
    public A() {
        System.out.println("A");
    }

    public void go(){
        System.out.println("AA");
    }

    public static void main(String[] args) {
        B b = new C();
        A a = b;
        a.go();
    }
}
