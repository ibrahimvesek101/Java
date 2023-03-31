package j16_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {
    public static void main(String[] args) {

        /*
		 format->
		 GUN
		 d : basta 0 varsa 0 yazmadan gun numarasi yazılır
		 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi yazar
		 DDD : yilin kacinci gunu oldugunu yazar
		 E, EE, EEE : gun isminin ilk 3 harfi
		 EEEE : gun isminin tamamini

		 AY (Ay icin M, dakika icin m kullanilir)
		 M : basta 0 varsa 0 yazmadan ay numarasi yazılır
		 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi yazılır
		 MMM : Ay isminin ilk 3 harfi yazılır
		 MMMM : Ay isminin tamami yazılır

		 YY : yilin son iki rakamini
		 YYYY : Yilin tamamini yazılır

		 Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)
		 HH : saatin tamami, tek rakamli saat olursa 02 gibi
		 H  : tek rakamli saat olursa sadece saati yazar

		 hh :  12 saat dilimine gore 2 rakam olarak yazılır
		 h : 12 saat dilimine gore tek rakam olanlari tek olarak yazılır

		 m : minute tek rakamlari tek yazlır
		 mm: tek rakamlari 08 gibi yazılır

		 a yazarsak AM veya PM degerini yazar


		 */







        LocalDate bugun=LocalDate.now();
        System.out.println("bugun = " + bugun);


        System.out.println("bugun.getYear() = " + bugun.getYear());

        System.out.println("bugun.getMonth() = " + bugun.getMonth());

        System.out.println("bugun.getMonthValue() = " + bugun.getMonthValue());

        System.out.println("bugun.getDayOfMonth() = " + bugun.getDayOfMonth());

        System.out.println("bugun.getDayOfWeek() = " + bugun.getDayOfWeek());

        System.out.println("bugun.getDayOfYear() = " + bugun.getDayOfYear());


        LocalDate date1=LocalDate.of(2016,3,23);
        LocalDate date2=LocalDate.of(2014, Month.MAY,19);

        System.out.println("*******");
        //tanımlana bir date'nin öncesi-minus() ve sonrası -plus()- a gitme
        System.out.println("date1 = " + date1);

        System.out.println("date1.plusDays(45) = " + date1.plusDays(45));

        System.out.println("date2.minusWeeks(33) = " + date2.minusWeeks(33));

        System.out.println("bugun.plusDays(11).minusWeeks(7).plusMonths(3).minusYears(5) = " + bugun.plusDays(11).minusWeeks(7).plusMonths(3).minusYears(5));


    }
}
