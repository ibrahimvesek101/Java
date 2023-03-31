package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {

    /*  task-> girilen tam sayıya kadar olan sayıların karelerinin toplamını
         print eden code create ediniz.

        Girilen sayı=4
        Kareler toplamı=30
     */

        Scanner input = new Scanner(System.in);

        System.out.print("sayı giriniz : ");

        int sayi = input.nextInt();

        int toplama = 0;

        for (int i = 0; i <= sayi; i++) {

            toplama += i * i;
        }
        System.out.print(toplama);

    }
}