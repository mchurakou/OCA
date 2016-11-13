package inheritage.hiding.method.nonstat;

/**
 * Created by mikalai on 15.10.2016.
 */
class Reindeer extends Deer {
    public Reindeer(int age) { System.out.print("Reindeer"); }
    public boolean hasHorns() { return true; }


    public static void main(String[] args) {
        Reindeer deer = new Reindeer(5);
        System.out.println(","+deer.hasHorns());
    }

}
