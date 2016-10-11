package oca.tip.defaultinterface;

/**
 * Created by mikalai on 11.10.2016.
 */
public interface A {
    public default void go(){
        System.out.println("A");
    }
}

