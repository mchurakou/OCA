package boxing;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mikalai on 15.10.2016.
 */
public class MySet {

    public static void main(String[] args) {
        Set<Short> s = new HashSet<Short>();

        for (short i = 0; i < 100; i++) {

            s.add(i);

            s.remove((short)(i - 1));

        }

        System.out.println(s.size());
    }
}
