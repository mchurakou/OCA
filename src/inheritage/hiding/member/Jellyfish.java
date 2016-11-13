package inheritage.hiding.member;

public class Jellyfish extends Animal {
    private int length = 5;
    public static void main(String[] args) {
        Jellyfish jellyfish = new Jellyfish();
        Animal animal = new Jellyfish();
        System.out.println(jellyfish.length);
        System.out.println(animal.length);
    }
}
