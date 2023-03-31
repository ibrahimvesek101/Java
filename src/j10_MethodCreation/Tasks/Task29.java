package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task29 {

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false

        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {

        System.out.println(powerOfThree(9));

    }

    private static boolean powerOfThree(int sayi) {
int sayac=0;
String uc="3*";
String ucKati="";
        int bolum = sayi;
        for (int i = sayi; i >= 3; i /= 3) {
            bolum = 3 / i;
            ucKati +=uc;
        sayac++;
        }
        if (bolum == 1) {
            System.out.print("Girdi : " + sayi+"\nÇıktı : true"+"\nAçıklama  = " + ucKati + " = "+sayi+ "\nSonuç : ");
        return true;
        } else {
            System.out.print("Girdi : " + sayi+"\nÇıktı : false"+"\n"+sayi+", 3 ün üssü (kuvveti) değildir."+"\nSonuç : ");
            return false;

    }
}}