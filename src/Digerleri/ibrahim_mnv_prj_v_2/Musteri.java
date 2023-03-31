package Digerleri.ibrahim_mnv_prj_v_2;

import java.util.Scanner;

public class Musteri {

    static Scanner input = new Scanner(System.in);

    public static void musteriMenu() {

        System.out.print("\n***** Menü *****\n1-Bakiye Öğrenmek\n" +
                "2-Ürün Listesi\n" +
                "3-Ürün Fiyatları\n" +
                "4-Ürün Satın Almak\n" +
                "5-Çıkış\nSeçmek istediğinizin sıra numarasını yazınız : ");

        int secim = input.nextInt();

        switch (secim) {
            case 1:
                Muhasebe.manavKartBakiye();
                System.out.println();
                Karar.menuVeyaCikisMusteri();
                break;

            case 2:
                Urunler.urunListesi();
                System.out.println();
                Karar.menuVeyaCikisMusteri();
                break;

            case 3:
                Urunler.urunFiyatlari();
                System.out.println();
                Karar.menuVeyaCikisMusteri();
                break;

            case 4:
                SatinAlma.satinAlmaHesap();
                System.out.println();
                Karar.menuVeyaCikisMusteri();
                break;

            case 5:
                Cikis.cikisMusteri();
                break;

        }

    }
}
