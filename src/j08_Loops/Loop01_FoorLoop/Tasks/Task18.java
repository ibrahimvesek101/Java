package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task18 {

    /*
    task-> Girilen bir tamsayının  3 kuvveti olup olmadığınıkontrol eden code create ediniz.
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

        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        int sayi = input.nextInt();


        //      Scanner input= new Scanner(System.in);
        //      System.out.print("metin giriniz : ");
        //      String kelime = input.nextLine();


        int bolum = sayi;
        int sayac = 0;

        for (int i = sayi; i >= 3; i /= 3) {

            bolum = 3 / i;
            sayac++;
        }
        if (bolum == 1) {

            System.out.println("Girdiğiniz sayı 3 ün "+sayac +". üssü dür.");

        } else System.out.println("Maalesef girdiğiniz sayı 3 ün bir üssü değildir.");
    }
}