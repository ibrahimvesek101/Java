package Digerleri.CananHoca.Mart29tasks;

import java.util.Scanner;

public class OkekBulma {
    public static void main(String[] args) {
        // kullanıcıdan alınan iki sayının okekini bul
        // input= 10, 20
        // output= 20

        // input2= 11, 24
        // output= 11*24

        Scanner scan  = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int sayi1= scan.nextInt();
        System.out.println("ikinci sayıyı giriniz: ");
        int sayi2= scan.nextInt();
        int buyuk= Math.max(sayi1,sayi2);
        int ekok= 0;

        for (int i = buyuk; i <= sayi1*sayi2; i++) { // i=20 den başlayıp  200e kadar gidiyor.
            // iki sayıdan büyük olanla döngüye başlandı,
            // hiç ortak bölen yok ise sayıların çarpımına kadar devam edecek
            if (i%sayi1==0 && i%sayi2==0) {
                ekok=i;
                break;
            }
        }

        System.out.println("Ekok: "+ekok);

    }
}
