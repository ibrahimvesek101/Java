package j13_ArrayList.Tasks;

import java.util.Scanner;

public class Task12_Manav {
    static Scanner input = new Scanner(System.in);
    static int kilo = 0;
    static int urunSecim = 0;
    static int urunFiyat = 0;
    static int toplamFiyat = 0;


    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */


        urunSecTutar();
    }

    private static void urunSecTutar() {
        System.out.print("1-Elma 5 Tl\n2-Portakal 10 TL\n3-Nar 15 TL\n4-Kivi 20TL\" +\n5-Muz 25TL" +
                "\nLütfen almak istediğiniz ürün numarasını giriniz : ");
        int secim = input.nextInt();
        System.out.print("kaç kilo satın almak istiyorsunuz? ");
        int kilo = input.nextInt();
        switch (secim) {
            case 1:
                toplamFiyat += kilo * 5;
                break;
            case 2:
                toplamFiyat += kilo * 10;
                break;
            case 3:
                toplamFiyat += kilo * 15;
                break;
            case 4:
                toplamFiyat += kilo * 20;
                break;
            case 5:
                toplamFiyat += kilo * 25;
                break;
        }
        tamamDevam();
    }


    private static void tamamDevam() {
        System.out.println("1-Alışverişe Devam\n2-Alışverişi bitir.\nLütfen seçiminizi yapınız : ");
        int a = input.nextInt();
        if (a == 1) {
            urunSecTutar();
        } else if (a == 2) {
            System.out.println("toplam fiyat = " + toplamFiyat+" TL");
        } else {
            System.out.println("doğru seçim yapınız");
        }
    }

}


