package Digerleri.CananHoca.Projeler.P01_ArrayList_Proje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmProjesi {
    static List<String> filmler = new ArrayList<>(Arrays.asList("ASLAN","YONCA","EMİNE","YUSUF","ZEHRA","IBRAHIM"));
    /*
     TASK :
      yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
      filmin index nosuna göre sectiriniz
      seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
      sağlayan method create ediniz...
      Ahanda TRICK...
      kullanıcının sectiği filmin harf sayısını  console yazdırınız.
      kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
      kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
      kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
      kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.


      1. adım: kullanıcıya film listesinden bir film seçtir.
      kullanıcı filmi seçerken hangi film olduğunu görmeyecek,
      numarasına göre seçecek.

      2. adım: filmGetir(); metodu oluştur.

      3. adım: harfleri "-" ile değiştir ve yazdır,
      filmin kaç harfli olduğunu yazdır.
      "JOKER" seçildiyse "-----" olarak gözüksün

      4. adım: filmdeki harf sayısına göre tahmin hakkı verilir.
        5 harfli film için 5*2 yani 10 tahmin hakkı

      5. adım: yanlış tahmin sayısını say

      6. adım: film için tahmin edilen harf al

      7. adım: harf filmin içinde bulunmuyorsa yanlış
       tahmin sayısını bir artır,
       bulunuyorsa harfin yerini göster

      8. adım: kazandınız veya kaybettiniz yazdır
     */
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("---Film tahmin oyununa Hoşgeldiniz---");

        //1. adım: kullanıcıya film listesinden bir film seçtir.
        System.out.println("1- " +(filmler.size())+ " arasında bir sayı giriniz");
        int secilenFilmIndex= scan.nextInt();

        //2. adım: filmGetir(); metodu oluştur.
        filmGetir(filmler,secilenFilmIndex-1);
    }

    private static void filmGetir(List<String> filmler, int index) {
        //3. adım: harfleri "-" ile değiştir ve yazdır,
        // filmin kaç harfli olduğunu yazdır.
        String tahminEdilecekFilm= (filmler.get(index).replaceAll("\\w","-"));
        // "-----"
        System.out.println(tahminEdilecekFilm);

        // 4. adım: filmdeki harf sayısına göre tahmin hakkı verilir.
        System.out.println(filmler.get(index).length()+" harfli filmi seçtiniz"
                +" tahmin için "+filmler.get(index).length() * 2+" hakkınız var ");

        // 5. adım: yanlış tahmin sayısını say
        int tahminSayisi=0;
        int dogruTahminSayisi=0;
        // tahminSayisi - dogruTahminSayisi= yanlış tahmin sayısı
        char harf=' ';
        String str=" ";

        do {
            System.out.println("yanlış tahmin sayısı: "    //0/10
                    + (tahminSayisi - dogruTahminSayisi)+"/"+filmler.get(index).length() * 2 );

            //6. adım: film için tahmin edilen harf al
            System.out.println("Tahmin ettiğiniz harfi giriniz");
            harf=scan.next().toUpperCase().charAt(0);
            str+=harf;

            //7. adım: harf filmin içinde bulunmuyorsa yanlış
            //       tahmin sayısını bir artır,
            if (!tahminEdilecekFilm.toString().contains(str)) {
                tahminSayisi++;
            }

            //harf filmin içinde bulunuyorsa
            for (int i = 0; i < tahminEdilecekFilm.length(); i++) {
                if(filmler.get(index).charAt(i) == harf) {
                    if (!tahminEdilecekFilm.toString().contains(filmler.get(index).substring(i,i+1))) {
                        dogruTahminSayisi++;
                    }
                    // -----, k, --k--,
                    tahminEdilecekFilm=tahminEdilecekFilm.substring(0,i)+harf+tahminEdilecekFilm.substring(i+1);
                }
            }

            //8. adım: kazandınız yazdır, -----, joker
            if (tahminEdilecekFilm.toString().equalsIgnoreCase(filmler.get(index))) {
                System.out.println("TEBRİKLER... Kazandınız !!!");
                System.out.println("Tahmin ettiğiniz film : "+ tahminEdilecekFilm);
                break;
            }
            System.out.println(tahminEdilecekFilm);


        } while(tahminSayisi - dogruTahminSayisi != filmler.get(index).length() * 2);

        //kaybettiyse
        if(tahminSayisi - dogruTahminSayisi==filmler.get(index).length() * 2) {
            System.out.println("yanlış tahmin sayısı: "+(tahminSayisi-dogruTahminSayisi));
            System.out.println("kaybettiniz, tahmin edmediğiniz film "+filmler.get(index));
        }

    }
}