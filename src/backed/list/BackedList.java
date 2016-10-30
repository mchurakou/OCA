package backed.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by mikalai on 30.10.2016.
 */
public class BackedList {

    public static void main(String[] args) {
        String[] array = { "hawk", "robin" }; // [hawk, robin]
         List<String> list = Arrays.asList(array); // returns fixed size list
         System.out.println(list.size()); // 2
         list.set(1, "test"); // [hawk, test]
         array[0] = "new"; // [new, test]
         for (String b : array) System.out.print(b + " "); // new test
         list.remove(1); // throws UnsupportedOperation Exception
    }
}
