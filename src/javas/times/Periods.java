package javas.times;

import java.time.Period;

/**
 * Created by Mikalai_Churakou on 11/1/2016.
 */
public class Periods

{

    public static void main(String[] args)
    {
        Period p1 = Period.of(0,1,1);
        Period p2 =  Period.ofYears(0).ofMonths(1).ofDays(1);

        System.out.println(p1.equals(p2));
    }
}
