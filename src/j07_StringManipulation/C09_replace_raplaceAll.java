package j07_StringManipulation;

import java.util.Scanner;

public class C09_replace_raplaceAll {
    public static void main(String[] args) {
        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
         * (update -set) saglar. Sonuc String'dir..
         *
         */

        String str = "javaCAN'lara selam bolcana offer :) ";
        System.out.println("str = " + str);//javaCAN'lara selam bolcana offer :)
        System.out.println(str.replace("a", "*"));//j*v*CAN'l*r* sel*m bolc*n* offer :)
        System.out.println(str.replace("can", "$"));//javaCAN'lara selam bol$a offer :)

        System.out.println("str.replaceFirst(\"a\",\":-)\") = " + str.replaceFirst("a", ":-)"));//j:-)vaCAN'lara selam bolcana offer :)
        System.out.println(str.replace('a', '§'));//j§v§CAN'l§r§ sel§m bolc§n§ offer :)
        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
        //1-replace() methodu char kabul eder ama replaceAll kabul etmez
        //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)

        //(Regular Expressions)
        //   \\s bosluk (
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler

        str = "javaCAN'lara selam bolcana 123456780232 § $ # £ offer :) ";
        System.out.println(str.replaceAll("\\s", "*"));//javaCAN'lara*selam*bolcana*123456780232*§*$*#*£*offer*:)*
        System.out.println(str.replaceAll("\\S", "*"));//************ ***** ******* ************ * * * * ***** **
        System.out.println(str.replaceAll("\\w", "*"));//*******'**** ***** ******* ************ § $ # £ ***** :)
        System.out.println(str.replaceAll("\\W", "*"));//javaCAN*lara*selam*bolcana*123456780232*********offer****
        System.out.println(str.replaceAll("\\d", "*"));//javaCAN'lara selam bolcana ************ § $ # £ offer :)
        System.out.println(str.replaceAll("\\D", "*"));//***************************123456780232******************
        //task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki formatta print eden code create ediniz.
        // isim-soyisim : M***** B*******
        // kart no : **** **** **** 1234
        Scanner input = new Scanner(System.in);

        System.out.print("Dadaş hele bir adını   giresen : ");
        String ad = input.nextLine();

        System.out.print("Dadaş hele bir soyadını giresen : ");
        String soyad = input.nextLine();

        System.out.print("bir kk no   giresen : ");
        String kk = input.nextLine();

        String yeniAd = ad.charAt(0) + ad.substring(1).replaceAll("\\w", "*");
        String yeniSoyad = soyad.charAt(0) + soyad.substring(1).replaceAll("\\w", "*");
        String yeniKK = "**** **** **** **** " + kk.substring(12);
        System.out.println("yeni isim : "+yeniAd+" yeni sayisim : "+yeniSoyad+" yeni KK : "+yeniKK);//M****** yeni sayisim : J****** yeni KK : **** **** **** **** 3456

    }
}