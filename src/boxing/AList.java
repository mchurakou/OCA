package boxing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikalai on 30.10.2016.
 */
public class AList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1);
        System.out.println(numbers);
    }
}
