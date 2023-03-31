package j16_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {

        // period -> iki tarih arasındaki geçen tekrarlanan datayı tutar.

        LocalDate bugun = LocalDate.now();

        LocalDate ibrahim = LocalDate.of(1985, 10, 15);

        Period p1 = Period.between(ibrahim, bugun);

        System.out.println("p1 = " + p1);

        System.out.println("p1.toTotalMonths() = " + p1.toTotalMonths());
        System.out.println("p1.getDays() = " + p1.getDays());
        System.out.println("p1.getYears() = " + p1.getYears());


        System.out.println("*******");


        System.out.println("bugun = " + bugun);

        Period p2 = Period.ofDays(9);
        Period p3 = Period.ofMonths(7);
        bugun.minus(p3); // bugünün yedi ay öncesi.
        System.out.println("p3 sonrası bugun = " + bugun);

        bugun = bugun.plus(p2); // bugünün 9 gün sonrası atandı.
        System.out.println("bugun = " + bugun);


// task-> 2.01.2023 tarihinde başlayan kursun süresi 9 ay
// old.göre bitiş tarihini prin eden code print ediniz.


        LocalDate baslangic = LocalDate.of(2023, 1, 2);

        Period kursSuresi = Period.ofMonths(9);
        System.out.println("kurs bitiş = " + baslangic.plus(kursSuresi).format(DateTimeFormatter.ISO_DATE));


        // ISO -> International Organization for Standardization

    }
}
