package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {

	/*
		 byte < short < int < long < float < double
			Auto Widening Casting -> Kucuk data type'larini buyuk data typlarina Java  otomatik olarak yapar.

		 */
        //Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirmek demektir.
        //              byte < short < int < long < float < double
        //Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
        //Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir

        boolean basarılı = true;
        //String basarı=basarılı; -> dogal uyum olmayan variable'larda castşng yapılamaz CTE
        // System.out.println("basarılı = " + basarılı);-> true
        // System.out.println("basarı = " + basarı);->true
        double d = 17;// double variable'a int 17 atandı k->b
        System.out.println("d = " + d);//d = 17.0 auto widding
        int sayi1 = 33;
        int sayi2 = 7;

        System.out.println(sayi1 / sayi2);// 4
        /*
        java iki int sayiyi biribirine böldugunuzde sonucu int verir
         eğer bölme işleminde ondalık sonuç çıkarsa ondalık kısmı siler
         */
        byte b = 127;
        int i = b;//k->b aw
        System.out.println("i = " + i);//127

        int num = 1453;
        double d1 = 17; //num;//k->b aw
        System.out.println("d1 = " + d1);//1453.0
        // double->b     int->k
        double db = d1 / num;//TRICK-> iki farklı data type sayi işleme girerse java
        // kucuk olan data type turu için aw yapar sonucu buyuk olan data type  olarak verir

        System.out.println("db = " + db);//db = 0.01169993117687543

        /*
		 byte < short < int < long < float < double
		 Explicit Narrowing Casting ->Buyuk data type'larini kucuk data type'larina cevirme islemini veri kaybndan dolayı
		 Java otomatik olarak yapmaz. kod ile teyit ister...

		 */
        double d2 = 14.53;
        int num2 = (int) d2;//b->k
        System.out.println("num2 = " + num2);//14

        int num3 = 150;
        byte b1 = (byte) num3;
        System.out.println("b1 = " + b1);//b1 = -106

        double d3 = 333;
        long l = (long) d3;

        double d4=571.9444;
        long l2= (long) d4;
        System.out.println("l2 = " + l2);//l2 = 571



        /* task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         */
        Scanner sc = new Scanner(System.in);//1 adım
        System.out.println("ascii değeri istediğin karakteri gir : ");//2 adım
        char ch=sc.nextLine().charAt(0);


        int chasciiDegeri=ch;
        System.out.println(ch+"'ın chasciiDegeri = " + chasciiDegeri);//$'ın chasciiDegeri = 36


    }
}
