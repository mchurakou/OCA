package syntax;

/**
 * Created by mikalai on 12/4/2016.
 */
public class I {
    int ii = i;
    int i = 1;

    void i(){
        for (int j = 0; j < 1; j++) {
            ii += 2;
        }
    }

    public static void main(String[] args) {
        I i = new I();
        i.i();
        System.out.println(i.ii);
    }
}
