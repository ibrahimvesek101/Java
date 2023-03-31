package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class Ternary_Ornek {
    public static void main(String[] args) {

 /*
 TASK :
Girilen sayi 0 dan buyuk esit ise 10 dan kucukluğunu kontrol ediniz.
10 dan kucuk ise  "Rakam" degilse "Pozitif Sayi" ,
Sayi 0'dan kucuk ise  "Negatif Sayi" print eden code create ediniz
 */
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz :");

        int sayi = input.nextInt();

        String sonuc =sayi<10?"rakam":sayi<100?"iki basamaklı sayı":"üç basamaklı veya daha büyük sayı";

        System.out.println(sonuc);
    }
}