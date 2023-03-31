package j16_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        // Local Time -> saat-dakika-saniye datalarını tutar.

        LocalTime suan= LocalTime.now();  //sistaemlden mevcut zaman suan a atandı.
        System.out.println("suan = " + suan);

        System.out.println("suan.getHour() = " + suan.getHour());

        System.out.println("suan.getMinute() = " + suan.getMinute());

        System.out.println("suan.getSecond() = " + suan.getSecond());

        System.out.println("suan.getNano() = " + suan.getNano());


        //tanımlana bir time 'nin öncesi-minus() ve sonrası -plus()- a gitme

        LocalTime time1 =LocalTime.of(17,23,53);

        System.out.println("time1 = " + time1);

        System.out.println("time1.plusHours(3).minusMinutes(83) = " + time1.plusHours(3).minusMinutes(83));


        System.out.println("loop çalışma süresini hesaplama : ");

        LocalTime loopBasi = LocalTime.now(); // loop başlangıcı zaman
        System.out.println("");
        int sayi = 0;

        for (int i = 0; i < 10; i++) {
            sayi+=i;

        }

        LocalTime loopSonu = LocalTime.now(); // loop sonu zaman
        System.out.println("Loop çalışma süresi = " + (loopSonu.getNano() - loopBasi.getNano()));


    }
}
