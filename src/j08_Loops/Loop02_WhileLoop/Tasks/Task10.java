package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  olan tek sayıları print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        int sayi = input.nextInt();


        int basla = 0;
        int toplam = 0;

        while (basla <= sayi) {
            if (basla % 2 == 1) {

                toplam = toplam + basla;
                System.out.print(basla + " ");
                basla++;
            } else basla++;

        }
        System.out.println();
        System.out.println(sayi + " sayısına kadar olan tek sayıların toplamı = " + toplam);

    }

}