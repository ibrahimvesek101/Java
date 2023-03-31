package j17_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
Java Pass By Value bir programlama dilidir.
Bir  primitive  variable  argument olarak bir methoda call edildiğinde variable
değil bir copy clone (vesikalık) (pointer)değeri gönderilir.

 */
// task -> verilen fiyat için %24 artırılmış fiyatı print eden method  create ediniz.

        double fiyat = 100;
        System.out.println("Method öncesi fiyat = "+ fiyat);
        fiyatArttir(fiyat);
        System.out.println("Method sonrası fiyat = "+ fiyat);
    }

    private static void fiyatArttir(double sayi) {
        sayi *= 1.24;
        System.out.println("fiyatınızın artmış hali (method içinde) = " + sayi);
    }
}
