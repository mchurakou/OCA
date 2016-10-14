package label;

/**
 * Created by mikalai on 15.10.2016.
 */
public class Lab {
    public static void main(String[] args) {
        int x = 5, j = 0;
        OUTER:
        for (int i = 0; i < 3; )
            do {
                i++;
                x++;
                if (x > 10) break;
                x += 4;
                j++;
            } while (j <= 2);
        System.out.println(x);
        System.out.println("!");
    }
}
