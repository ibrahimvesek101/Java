package j16_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C05_ZoneIdDateTime {
    public static void main(String[] args) {

        // herhangi bi ılke-sehir(local) tarih-zaman datasını tutar
        LocalDate usaDate=LocalDate.now(ZoneId.of("America/New_York"));//America/New_York  mevcut date ataması yapıldı
        LocalTime usaTime=LocalTime.now(ZoneId.of("America/New_York"));//America/New_York  mevcut time ataması yapıldı

        System.out.println("usaTime = " + usaTime);//usaTime = 01:07:34.024898
        System.out.println("usaDate = " + usaDate);//usaDate = 2023-02-25

        ZonedDateTime zdt1=ZonedDateTime.now(ZoneId.of("America/New_York"));//America/New_York mevcut dateTime ataması yapıldı
        System.out.println("zdt1 = " + zdt1);//zdt1 = 2023-02-25T01:11:19.625901-05:00[America/New_York]
        //  ZonedDateTime zdt2=ZonedDateTime.now(ZoneId.of("America"));// RTE->ZoneRulesException firlatır
        // System.out.println("zdt2 = " + zdt2);
        ZonedDateTime zdt3=ZonedDateTime.now(ZoneId.of("Japan"));//
        System.out.println("zdt3 = " + zdt3);// ZonedDateTime zdt1=ZonedDateTime.now(ZoneId.of("America/New_York"));
    }
}