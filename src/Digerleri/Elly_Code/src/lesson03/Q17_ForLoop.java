package Digerleri.Elly_Code.src.lesson03;

import java.util.Scanner;

public class Q17_ForLoop {
    /*   Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazın
         Örnek Ekran Çıktısı
         Girilen sayı=4               1 -> 1  2-> 4  3->9
         Kareler toplamı=14
          */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 den buyuk bir tam sayi giriniz :");
        int sayi  =sc.nextInt();
        int karelerToplam= 0;

        for (int i = 1; i < sayi; i++) {
            System.out.print(i + " ");
            karelerToplam +=i*i;
        }
        System.out.println();
        System.out.println("karelerToplam = " + karelerToplam);

    }
}
















