package Digerleri.CananHoca.ArrayListCozum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task01_Market {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.

     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */
    static ArrayList<String> gunler = new ArrayList<>(Arrays.asList("p.tesi", "salı", "carşamba", "perşembe", "cuma", "c.tesi", "pazar"));
    // 1. adım
    static ArrayList<Integer> gunlukKazanclar= new ArrayList<>();
    // günlük kazançlar listesini içi boş, kullanıcıdan veri aldıkça dolacak
    // 2. adım
    static Scanner scan = new Scanner(System.in);
    static int haftalikKazanc=0;

    public static void main(String[] args) {

        int gun=0;
        while (gun<7) { //3. adım
            System.out.println(" günlük kazancınızı girin");
            int kazanc= scan.nextInt();
            gunlukKazanclar.add(kazanc);
            haftalikKazanc+=kazanc;
            gun++;
        }
        getOrtalamaKazanc();
        getOrtalamaninUstundeKazancGünleri();
        getOrtalamaninAltindaKazancGünleri();
        System.out.println("ortalama kazanç: "+getOrtalamaKazanc());
        System.out.println("ortalama kazancın üstü: "+getOrtalamaninUstundeKazancGünleri());
        System.out.println("ortalama kazancın altı: "+getOrtalamaninAltindaKazancGünleri());

    }

    private static String getOrtalamaninAltindaKazancGünleri() {
        String ortalamaAlti=" ";

        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) < getOrtalamaKazanc()) {
                ortalamaAlti+=gunler.get(i)+" ";
            }
        }
        return ortalamaAlti;
    }

    private static String getOrtalamaninUstundeKazancGünleri() { //5. adım
        String ortalamaUstu= " ";

        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i)> getOrtalamaKazanc())  {
                ortalamaUstu+= gunler.get(i)+" ";
            }

        }
        return ortalamaUstu;
    }

    private static int getOrtalamaKazanc() { //4. adım
        int ortalama= haftalikKazanc/7;
        return ortalama;
    }
}