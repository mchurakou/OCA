package inheritage.hiding.method.stat;

/**
 * Created by mikalai on 14.11.2016.
 */
public class Marsupial {
    public static boolean isBiped() {
        return false;
    }
    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped());
    }
}
