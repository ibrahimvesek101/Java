package j16_DateTime;

import java.time.LocalDate;

public class C07_ComparingDateTime {
    public static void main(String[] args) {


        /*     ComperaTo komutu işlevi:
2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için    */

        LocalDate bugun = LocalDate.now();
        LocalDate falanGun=bugun.plusDays(58);
        LocalDate fesmekan = bugun.minusDays(23);

        System.out.println("bugun = " + bugun);
        System.out.println("falanGun = " + falanGun);
        System.out.println("fesmekan = " + fesmekan);


        System.out.println("bugun.isAfter(falanGun) = " + bugun.isAfter(falanGun));
        System.out.println("fesmekan.isBefore(falanGun) = " + fesmekan.isBefore(falanGun));


        System.out.println("bugun.isLeapYear() = " + bugun.isLeapYear());  // bugün artık yıl mı?

        System.out.println("bugun.compareTo(falanGun) = " + bugun.compareTo(falanGun));
        System.out.println("falanGun.compareTo(fesmekan) = " + falanGun.compareTo(fesmekan));


    }
}
