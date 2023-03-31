package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C07_NestedTernaryOperator {
    public static void main(String[] args) {

/*
      TASK :
       Girilen bir pozitif tamsayı  4 basamaklı ise  "4 Basamaklı"
      degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı"
      degilse "4 basamaklı olmayan tek sayı"  print eden code create ediniz.

       */

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz :");

        int sayi = input.nextInt();

        System.out.println((sayi>999 && sayi<10000 ?"dört basamaklı"  : sayi%2==0?"dört basamaklı olmayan çift sayı" : "dört basamaklı olmayan tek sayı"));

    }
}
