package j14_ForEachLoop;

public class C01_Varargs {
    public static void main(String[] args) {
/*
        VARARGS :
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        method body....

        }

	        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISSS -> Diva en son sahne alır
		    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS -> diva tek olur.iki diva bir ipte yurumez

           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli...

  */

        int sayi1 = 46;
        int sayi2 = 27;
        int sayi3 = 58;
        int sayi4 = 34;


        //Task01-> verilen 2 int value toplayan method create ediniz..
        System.out.println("   ***   Task01  ***   ");
        topla(sayi1, sayi2);//73
        topla(sayi3, sayi2);//85
        topla(sayi3, sayi4);//92
        topla(85, 92);//177

        //Task02-> verilen 3 int value toplayan method create ediniz..
        System.out.println("   ***   Task02  ***   ");
        topla(sayi1, 23, sayi3);//127

        System.out.println("   ***   varargs method   ***   ");

        toplaVarargs(sayi1, 23, sayi3);//127
        toplaVarargs(sayi1,sayi2);//73
        toplaVarargs(sayi3,sayi4);//92

        //Task03-> verilen String value'lerin en cok karaktere sahip olanı print METHOD create ediniz..
        System.out.println("   ***   Task03  ***   ");
        enUzuuunString("javaCAN","javaTAR","sefil javacı Haluk");//sefil javacı Haluk
        enUzuuunString("javASLAN","javaTARIH","perfect"," javacı Abdulhamit");// javacı Abdulhamit
        enUzuuunString("Aydın","qa tester Murat");//qa tester Murat

    }//main sonu

    private static void enUzuuunString(String ... str ) {//varargs ->diva method->parametre sayısı belirsiz.

        String uzuuuunString="";

        for (String w:str) {
            if (w.length()>uzuuuunString.length()) {//parametre olarak gelen str arrayin herbir string elemanı boyutu enuzundan buyukse
                uzuuuunString=w;
            }
        }
        System.out.println("en uzuuuun kelime : "+uzuuuunString);


    }

    private static void toplaVarargs(int...ebikGabık) {//diva method->dataType...dataName
        int toplam=0;
        for (int a:ebikGabık) {//methoda parametre olarak gelen value'ler a'ya atandı ve a tekrara alındı
            toplam+=a;
        }
        System.out.println("sayıların toplamı : "+toplam);

    }

    private static void topla(int num1, int num2) {// 2p'li void method overload
        System.out.println("sayılar toplamı : "+(num1+num2));
    }
    private static void topla(int num1, int num2, int num3) {// 3p'li void method overload
        System.out.println("sayılar toplamı : "+(num1+num2+num3));
    }

}//class sonu