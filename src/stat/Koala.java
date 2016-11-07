package stat;

/**
 * Created by mikalai on 07.11.2016.
 */
    public class Koala {
        public static int count = 0;
        public static void main(String[] args) {
            Koala k = new Koala();
            k.count++;
            System.out.println(k.count);
            Koala.count++;
            k = null;
            System.out.println(k.count);
        }
    }
