package j04_JavaOperators.j01_AritmeticOperators;

public class C01_AritmeticOperators {
    public static void main(String[] args) {


        int a = 13;
        int b = 17;
        int c = 47;

        System.out.println(b+a*c);//628
        System.out.println(c-a/(b-c)+a*b);//268

        //int'i int'e boldugunuz zaman sonuc int cikar.
        //Java yuvarlama islemi yapmaz, sonucun tam kismini bolme isleminin sonucu olarak ekrana yazar.
        //Ornegin 47/10 isleminin sonucu matematikte 4.7'dir fakat Java'da 4'd�r.
        System.out.println(c / a);//4

		/*
		 Islem Onceligi:
		  1)üs ve Parantez ici islemler
		  2)Carpma ve bolmeler
		  3)Toplama ve cikarmalar
		 */

        System.out.println(b + a * c);//481
        System.out.println(b + (c - 2 * b) / 2);//23
        System.out.println(c - a / (b - c) + a * b);

        //Farkli data type'lari ile matematiksel islemler yaparsaniz sonuc buyuk data type'inda verilir.
        //byte < short < int < long < float < double
        int d = 12;
        double e = 4;
        float f = 4f;
        System.out.println(d / e);//3.0
        System.out.println(d + e);//16.0
        System.out.println(e / d);//0.3333333333333333
        System.out.println(f / d);//0.33333334

        //Modulus Islemi : Iki ondalik olmayan sayi birbirine bolundugunde kalani verir
        //Java'da Modulus Islemi'nin sembolu "%" isaretidir.

        System.out.println(13 % 5);
        System.out.println(245 % 3);

        //Cift Sayi (even) : 2'ye bolundugunde 0 kalanini veren sayilardir.
        //Tek Sayi (odd) : 2'ye bolundugunde 1 kalanini veren sayilardir.

        System.out.println(1234567 % 2);//Sonuc 1 ise tek sayidir, 0 ise cift sayidir


        int g=2;
        int h=3;
        String  s="JavaCAN";
        //Task-> g h s variable'ları kullanarak 61JavaCAN-1 print eden code create ediniz.


        System.out.println(""+(g*h)+(h-g)+s+(g-h));//61JavaCAN-1












    }
}
