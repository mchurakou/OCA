package iface;

/**
 * Created by mikalai on 12.11.2016.
 */
public interface def1 {
    default void go(){
        System.out.println("def1");
    }

    static void go1(){
        System.out.println("stat");
    }
}
