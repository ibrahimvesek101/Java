package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task16 {

    /*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
     * */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("sayı giriniz : ");

        int sayi = input.nextInt();
        int bolenSayisi = 0;
        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                bolenSayisi++;
            }
        }
        if (bolenSayisi == 0) {
            System.out.println("sayı asaldır.");

        } else System.out.println("sayı asal değildir.");

    }
}
