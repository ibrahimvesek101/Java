package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        /* Task->
         Girilen bir sayı için

		 Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
		 Eger 10 dan buyuk ise "Buyuksun!" yazdirin
		 Eger 10 dan kucuk ise "Normalsin!" yazdirin

		 Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
		 Eger -10 dan buyuk ise "Negatifsin!" yazdirin
		 Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin
         */


        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        int sayi = input.nextInt();

        if (sayi > 0) {
            if (sayi > 10) {
                System.out.println("Büyüksün");
            } else System.out.println("Normalsin");

        } else {
            if (sayi > -10) {
                System.out.println("Negatifsin");
            } else {
                System.out.println("Çok negatifsin");
            }

        }


    }
}

