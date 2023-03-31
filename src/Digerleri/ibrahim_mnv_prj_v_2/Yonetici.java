package Digerleri.ibrahim_mnv_prj_v_2;

import java.util.Scanner;

public class Yonetici {
    static int girilenSifre;
    static Scanner input = new Scanner(System.in);

    public static void yoneticiSifreKontrol() {

        int sayac = 3;
        int sifre = 571;

        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Lütfen şifrenizi giriniz : ");

            int girilenSifre = input.nextInt();
            if (sifre == girilenSifre) {
                System.out.println("Giriş başarılı.");
                Yonetici.yoneticiMenu();
                break;
            } else {
                sayac--;
                System.out.println("Şifreyi doğru girmeniz için kalan hakkınız = "+sayac);
            }

        } while (sayac >= 1);
        if (sayac == 0)
            System.out.println("Şifre bloke oldu. Yeni şifre almak için İbrahim Vesek ile görüşünüz :) ");
    }


    public static void yoneticiMenu() {
        System.out.print("\n1-Bütçedeki Para Miktarını Öğrenmek\n" +
                "2-Urun Fiyatlarını Görmek\n" +
                "3-Stok Durumunu Öğrenmek\n" +
                "4-Çıkış için\n" +
                "Seçmek istediğinizin sıra numarasını yazınız : ");

        int yoneticiSecimi = input.nextInt();

        switch (yoneticiSecimi) {

            case 1:
                Muhasebe.butce();
                System.out.println();
                Karar.menuVeyaCikisYonetici();
                break;
            case 2:
                Urunler.urunFiyatlari();
                System.out.println();
                Karar.menuVeyaCikisYonetici();
                break;

            case 3:
                UrunStok.stokDurumu();
                System.out.println();
                Karar.menuVeyaCikisYonetici();
                break;

            case 4:
                Cikis.cikisYonetici();
                break;

            default:
                System.out.println("Lütfen doğru giriş yapınız.");
                Yonetici.yoneticiMenu();


        }
    }
}