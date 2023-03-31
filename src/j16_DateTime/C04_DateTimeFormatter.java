package j16_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class C04_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now(); // sistemde mecut date ve time datasını ldt ye atandı.

        System.out.println("ldt = " + ldt);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd - MM - YY");  // tarih print edecek format tanımladık.
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH : mm : ss ");  // zaman print edecek format tanımladık.
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh : mm : ss ");  // zaman print edecek format tanımladık.

        System.out.println("dtf1.format(ldt) = " + dtf1.format(ldt));
        System.out.println("dtf2.format(ldt) = " + dtf2.format(ldt));
        System.out.println("dtf2.format(ldt) = " + dtf3.format(ldt));



    }
}
