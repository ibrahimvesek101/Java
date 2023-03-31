package Digerleri.CananHoca.ArrayListCozum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task12_Manav {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster,
         *           istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam
         * fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * urun listesi: elma, armut, portakal, kivi, muz
         * fiyat listesi: 3, 5, 7, 4, 3
         *             -kullanıcı 5 kilo elma istiyor-
         * output= 15 (5 kilo elmanın fiyatı), devam etmek istiyor musunuz?
         *              -evet, hayır-
         *  evetse işlem tekrarlar, hayırsa aldığı bütün ürünlerin toplamını
         *  ekrana yazar
         *
         * */
        static ArrayList<String> urunListesi =
                new ArrayList<>(Arrays.asList("elma- ürün kodu: 1", "armut- ürün kodu: 2", "portakal- ürün kodu: 3", "kivi - ürün kodu: 4", "muz, ürün kodu: 5"));
        static ArrayList<Integer> fiyatListesi= new ArrayList<>(Arrays.asList(3, 5, 7, 4, 3));
        static int toplamOdenecekTutar;
        static Scanner scan = new Scanner(System.in);
        public static void main(String[] args) {
                musteriSecim();

        }

        private static void musteriSecim() {
                System.out.println(urunListesi);
                System.out.println("hangi ürünü seçmek istersiniz");
                int secim= scan.nextInt();

                System.out.println("seçtiğiniz üründen kaç kilo almak istiyorsunuz");
                int kilo= scan.nextInt();
                //1. adım

                toplamOdenecekTutar+=kilo*fiyatListesi.get(secim - 1 );
                // alınan ürünün fiyatı toplama eklendi

                System.out.println("başka bir ürün almak istiyorsanız 1 i seçin, istemiyorsanız 2 yi seçin");
                int karar= scan.nextInt();

                if (karar==1) {
                        musteriSecim();
                } else {
                        System.out.println(" alışverişin toplam tutarı "+ toplamOdenecekTutar);
                }
        }}