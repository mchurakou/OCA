package access.bird.swan;

import access.bird.Bird;

/**
 * Created by mikalai on 07.11.2016.
 */
public class Swan extends Bird {
    public void swim() {
        floatInWater();
        System.out.println(text);
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherBirdSwim() {
        Bird other = new Bird();
        other.floatInWater();
        System.out.println(other.text);
    }

    public static void main(String[] args) {
        Swan s = new Swan();
        s.swim();
        s.helpOtherBirdSwim();
        s.helpOtherSwanSwim();
    }
}
