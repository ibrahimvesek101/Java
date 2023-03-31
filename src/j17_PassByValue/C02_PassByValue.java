package j17_PassByValue;

public class C02_PassByValue {
    public static void main(String[] args) {

        //  task -> verilen fiyat için %11 %22 ve %33
        //  indirimli  fiyatı print eden return type METHODlar  create ediniz.

        int fiyat=100;
        System.out.println(fiyat);

        indir11(fiyat);
        System.out.println(fiyat);

        indir22(fiyat);
        System.out.println(fiyat);

        indir33(fiyat);
        System.out.println(fiyat);
    }

    private static void indir33(double fiyat) {
        System.out.println(fiyat *= 0.67);

    }

    private static void indir22(double fiyat) {
        System.out.println(fiyat *= 0.78);
    }

    private static void indir11(double fiyat) {
        System.out.println(fiyat *= 0.89);
    }
}
