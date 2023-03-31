package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task16_KelimeOyunu01 {
    static Scanner input = new Scanner(System.in);
    static String kelime1 = "";
    static String ekKelime = "";
    static int birinciOyuncuPuan = 0;
    static int ikinciOyuncuPuan = 0;

    public static void main(String[] args) {

        /* Iki kisinin oynayacagi bir kelime oyunu uretelim
         * Kurallar
         * 1- ) Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
         *
         * 2-) 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
         *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
         *        ve 3.adima gecin
         *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
         *        kazandigini yazip oyunu bitirin
         *
         * 3-) yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
         *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
         *          basa mi sona mi ekleyecegini sorun
         *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
         *
         *      * Devam etmek istemezse
         *          "Oyun bitti" yazin
         *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
         */

        kelimeOyunu();

    }

    private static void kelimeOyunu() {

        System.out.print("1.Oyuncu bir kelime giriniz : ");
        kelime1 = input.nextLine();
        System.out.println(kelime1);
        kelimeKabulMu();
    }

    private static void kelimeKabulMu() {
        System.out.print("1-Kabul\n2-Red\nSayın 2.Oyuncu, " +
                "kelimeyi kabul ediyor musunuz? : ");
        int kabulRed = input.nextInt();
        switch (kabulRed) {
            case 1:
                birinciOyuncuPuanEkle();
                tamamDevam();
                break;
            case 2:
                System.out.println("Geçersiz kelime\n1.Oyuncu kazandı.");
                break;
        }

    }

    private static void tamamDevam() {
        System.out.print("1-Oyuna Devam Et\n2-Oyunu Bitir\nSayın 2.Oyuncu oyuna devam etmek istiyor musunuz? :");
        int tamamDevam = input.nextInt();
        switch (tamamDevam) {
            case 1:
                oyunaDevamEt();
                kelimeEkle();
                break;
            case 2:
                System.out.println("Oyun bitti.\nBirinci Oyuncu Puan : " + birinciOyuncuPuan + "\nIkinci Oyuncu Puan : " + ikinciOyuncuPuan);
                System.out.println(birinciOyuncuPuan < ikinciOyuncuPuan ? "İkinci oyuncu kazandı." : "Birinci oyuncu kazandı.");
                break;
        }
    }

    private static void oyunaDevamEt() {
        System.out.print("Eklemek istediğiniz kelimeyi giriniz : ");
        ekKelime = input.next();

    }

    private static void kelimeEkle() {
        System.out.print("1-Başa ekle\n2-Sona ekle\nBaşa mı sona mı eklensin ?");
        int basSon = input.nextInt();
        switch (basSon) {
            case 1:
                System.out.println(ekKelime+kelime1);
                tamamDevam();
                break;
            case 2:
                System.out.println(kelime1+ekKelime);
                tamamDevam();
                break;

        }
    }

    private static void birinciOyuncuPuanEkle() {
        birinciOyuncuPuan = kelime1.length();
    }
}
// birinci oyuncu ile ikinci oyuncu puanlarını ekle.
