package access;

/**
 * Created by mikalai on 15.10.2016.
 */
public class Deer {
    public Deer() { System.out.print("Deer"); }
    public Deer(int age) { System.out.print("DeerAge"); }
    private boolean hasHorns() { return false; }
    public static void main(String[] args) {
        Deer deer = new Reindeer(5);
        System.out.println(","+deer.hasHorns());
    }
}
