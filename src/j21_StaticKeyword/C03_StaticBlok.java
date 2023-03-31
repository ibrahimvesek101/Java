package j21_StaticKeyword;

public class C03_StaticBlok {//Class level

    static String isim = "ibrahim";

    static { //Static block
        System.out.println("1.static blok run edildi");
        System.out.println("1.blok update öncesi isim = " + isim);
        isim = "vesek";
        System.out.println("1.blok update sonrası isim = " + isim);
    }

    public static void main(String[] args) {    //main level

        /*
       1.static block yapıları static variable'rı değer ataması update için kullanılır
       2.static block Class oluşturulduğunda butun method'lardan(main method dahil) önce çalışır
       3.birden fazla static block varsa yukarıdan aşagiya sıralama ile çalışır.
       4.static bloklar sadece 1 kere en basta calisir static olmayan bloklar her obje olusturulurken yeniden calisir
        */
        System.out.println("main method başladı.");
        isim = "main vesek";
        System.out.println("maindeki isim = " + isim);
        System.out.println("main method bitti.");

    }//main sonu

    static {
        System.out.println("\"2.static blok\" = " + "2.static blok");
        System.out.println("2.blok update öncesi isim = " + isim);
        isim = "vesek ibrahim";
        System.out.println("2.blok update sonrası isim = " + isim);
    }
}
