package j13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task01_Market {
    static Scanner input = new Scanner(System.in);

    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
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
    public static void main(String[] args) {


        ArrayList<String> gunler = new ArrayList<String>(Arrays.asList("pazartesi", "salı", "çarşamba", "perşembe", "cuma", "cumartesi", "pazar"));
        ArrayList<Integer> gunlukKazanclar = new ArrayList<Integer>();
        int a = 0;
        while (a < 7) {
            System.out.print(gunler.get(a) + " gününün kazancını giriniz : ");
            int kazanc = input.nextInt();
            gunlukKazanclar.add(kazanc);
            a++;
        }
        System.out.println("getOrtalamaKazanc(gunlukKazanclar) = " + getOrtalamaKazanc(gunlukKazanclar));
        System.out.println("getOrtalamaninUstundeKazancGünleri(gunler,gunlukKazanclar) = " + getOrtalamaninUstundeKazancGünleri(gunler, gunlukKazanclar));
        System.out.println("getOrtalamaninAltindaKazancGünleri(gunler,gunlukKazanclar) = " + getOrtalamaninAltindaKazancGünleri(gunler, gunlukKazanclar));

    }

    private static ArrayList getOrtalamaninAltindaKazancGünleri(ArrayList<String> gunler, ArrayList<Integer> gunlukKazanclar) {
        ArrayList<String> getOrtalamaninAltindaKazancGünleri = new ArrayList<>();
        for (int i = 0; i < gunler.size(); i++) {
            if (gunlukKazanclar.get(i) < getOrtalamaKazanc(gunlukKazanclar)) {
                getOrtalamaninAltindaKazancGünleri.add(gunler.get(i));
            }
        }
        return getOrtalamaninAltindaKazancGünleri;
    }

    private static ArrayList getOrtalamaninUstundeKazancGünleri(ArrayList<String> gunler, ArrayList<Integer> gunlukKazanclar) {
        ArrayList<String> OrtalamaninUstundeKazancGünleri = new ArrayList<>();
        for (int i = 0; i < gunler.size(); i++) {
            if (gunlukKazanclar.get(i) > getOrtalamaKazanc(gunlukKazanclar)) {
                OrtalamaninUstundeKazancGünleri.add(gunler.get(i));

            }
        }
        return OrtalamaninUstundeKazancGünleri;
    }

    private static double getOrtalamaKazanc(ArrayList gunlukKazanclar) {
        int toplam = 0;
        double ortKazanc = 0;
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            toplam += (int) gunlukKazanclar.get(i);
            ortKazanc = toplam / 7;
        }
        return ortKazanc;
    }

}
