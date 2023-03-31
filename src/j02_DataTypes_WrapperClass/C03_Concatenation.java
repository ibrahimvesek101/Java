package j02_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {
   /*
        Not: char variable'lari matematiksel islemlerde kullanirsaniz, Java onlarin ASCII degerlerini kullanir.
             Ornegin; System.out.println('A' + 'C'); ekrana AC yerine 132 yazdirir
        Note: Java'da "+" sembolunun iki anlami vardir. i)Toplama islemi ii)Birlestirme Islemi(Concatenation)
              Java "+" sembolu gorunce once toplama yapmaya calisir, yapamazsa birlestirme islemi yapmaya calisir, o da olmazsa hata verir.
     */
        String ad = "Haluk";
        String soyad = "Bilgin";

        int a = 7;
        int b = 11;

        // Birden çok String variable ile farklı data type  variable'ler + ile işleme alınırsa
        // java birleştirme yaparak yeni bir String oluşturur.
        // TRICK :) Bir aritmetik işlem içinde String kullanılırsa, aritmetik işlem önceliğine göre
        // işlem yapılıp String variable’a Concatenation yapılır.

        // Trick ->  String variable cok gucludur. Hangi data turu ile isleme girerse girsin kendine benzetir. -> ch+isim=1Haluk

        System.out.println(ad+soyad+a+b);//HalukBilgin711

        System.out.println(a+ad+soyad+b);//7HalukBilgin11

        System.out.println(a+b+ad+soyad);//18HalukBilgin

        System.out.println(" "+a+b);// 711

        System.out.println(ad+soyad+(a+b));//HalukBilgin18

        System.out.println((a+b)+ad+soyad);//18HalukBilgin

        System.out.println(ad+(a-b)+(a-b));//Haluk-4-4

        System.out.println(ad+((a-b)+(a-b)));//Haluk-8

        char ch='1';//
        System.out.println(ad+ch);//Haluk1

        System.out.println(a+ch+ad);//56Haluk

        System.out.println(ad+(ch+b));//Haluk60

        System.out.println(a+ad+ch);//7Haluk1

      /* TRICK -> char data turu isleme girdigi variables'in turune gore farkli işlem yapar
        eger isleme girdigi variables  aritmetik bir islemse  ascii değeri ile işlem yapar ->
       */
    }
}
