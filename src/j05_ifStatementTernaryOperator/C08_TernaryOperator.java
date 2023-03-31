package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C08_TernaryOperator {
    public static void main(String[] args) {

/*
Task-> Girilen  ürün miktarını ve ürünün birim fiyatını için Eğer urun miktarı 100 den fazla ise
      %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
*/

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen ürün miktarı giriniz :");

        double urunMiktari = input.nextDouble();

        System.out.print("Lütfen birim fiyatı giriniz :");

        double birimFiyati = input.nextDouble();

        System.out.println(urunMiktari > 100 ? (urunMiktari * birimFiyati * 0.67) : (urunMiktari * birimFiyati));


    }
}
