package gc;

/**
 * Created by Mikalai_Churakou on 11/30/2016.
 */
public class A
{

    public static void main(String[] args)
    {
        A a1 = new A();
        A a2 = new A();
        a1 = a2;
        a2 = null;
        // GC happened
    }

    protected void finalize(Object o) throws Throwable
    {
        System.out.println("FIN");
    }
}
