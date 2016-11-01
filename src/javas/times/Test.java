package javas.times;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by Mikalai_Churakou on 11/1/2016.
 */
public class Test

{

    public static void main(String[] args)
    {
        LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
        date1.plusDays(1);

        LocalDate date2 = LocalDate.of(2020, 1, 21) ;
        System.out.println(date1.equals(date2));
    }
}
