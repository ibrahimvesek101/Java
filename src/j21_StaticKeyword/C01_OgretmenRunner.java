package j21_StaticKeyword;

public class C01_OgretmenRunner {
    public static void main(String[] args) {

        C01_Ogretmen.okul="Clarusway"; //Güneş update edildi.
        System.out.println("C01_Ogretmen.okul = " + C01_Ogretmen.okul);
        C01_Ogretmen ogrt1 = new C01_Ogretmen("ibrahim", 11);
        System.out.println("ogrt1.isim = " + ogrt1.isim);
        System.out.println("ogrt1.tecrube = " + ogrt1.tecrube);
        ogrt1.evlilikYıldonumu();
        C01_Ogretmen.maasHesapla();
        //ogrt1.okul   -> obj ile static static veriable call edilemez.
        C01_Ogretmen.okul="Kabataş";
        System.out.println("C01_Ogretmen.okul = " + C01_Ogretmen.okul); // Kabataş

        C01_Ogretmen ogrt2 = new C01_Ogretmen("neda", 7);
        System.out.println("ogrt2.isim = " + ogrt2.isim);
        System.out.println("ogrt2.tecrube = " + ogrt2.tecrube);

    }
}
