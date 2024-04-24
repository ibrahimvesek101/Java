package Digerleri.ibrahim_mnv_prj_v_2;

public class Urunler {

    static int elmaFiyat = 15;
    static int portakalFiyat = 10;
    static int muzFiyat = 20;
    static int narFiyat = 25;

    public static void urunListesi() {

        System.out.println("\nÜrünler : " +
                "\n1-) Elma" +
                "\n2-) Portakal" +
                "\n3-) Muz" +
                "\n4-) Nar");
    }

    public static void urunFiyatlari() {


        System.out.println("\nÜrün Fiyatları : " +
                "\nElma = " + elmaFiyat + " TL" +
                "\nPortakal = " + portakalFiyat + " TL" +
                "\nMuz= " + muzFiyat + " TL" +
                "\nNar= " + narFiyat + " TL");
    }


}
