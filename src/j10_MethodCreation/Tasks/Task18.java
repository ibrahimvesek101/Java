package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {

       /* task-> girilen üç tamsaynın
        bir dik üçgenin kenar uzunlukları olamsını kontrol eden METHOD create ediniz.
        (Trick->: a b c kenarları için  a2+b2=c2 pisagor  şartı sağlanmalı)

        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
         dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        dik üçgen değildir.*/

        dikUcgenKontrolEt(3, 4, 6);
    }

    private static void dikUcgenKontrolEt(double kenar1, double kenar2, double kenar3) {

        if ((Math.pow(kenar1, 2) + (Math.pow(kenar2, 2)) == (Math.pow(kenar3, 2)))) {
            System.out.println("Dik üçgen");


        } else System.out.println("Dik üçgen değil");

    }
}
