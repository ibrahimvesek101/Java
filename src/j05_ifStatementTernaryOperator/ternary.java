package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {


         /*
       Ternary ile yapılan tum actionlar if-else blok ile de yapılır.
       Ternary blok code daha clean daha okunabilir ve anlaşılabilir olması için tercih edilir
       Ternary blok içinde komplex code yerine daha basic ve doğrudan sonuç üreten code'lar bulunur
        */
        // Task-> girilen bir tamsayının  tek-çift olmasını kontrol eden code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz :");
        int sayi = input.nextInt();

        System.out.println("   ***  if blok   ***   ");

        if (sayi % 2 == 0) {
            System.out.println("agam sayi CIFT :) ");
        } else System.out.println("agam sayi TEK :( ");

        System.out.println("   ***  j05_ifStatementTernaryOperator.ternary blok   ***   ");

        // condition(şart)  ?(if-ise) şart true olunca yapılacak action    :   (else-değilse) şart false olunca yapılacak action
        String sonuc = sayi % 2 == 0 ? "agam sayi CIFT :) " : "agam sayi TEK :( ";//bu komutun çıktısı String Type variable'dır
        System.out.println(sonuc);
        System.out.println(sayi % 2 == 0 ? "agam sayi CIFT :) " : "agam sayi TEK :( ");
/*
 ahan da Trick-> j05_ifStatementTernaryOperator.ternary operator action sonucu true veya false sonucuna göre bir cıktıverir.
 Eğer bu çıktı data Type'na göre bir variable atanmazsa CTE verir.
 Çözüm olarak ya print komutuna alınmalı yada bir variable atanmalı
 */

    }
}
