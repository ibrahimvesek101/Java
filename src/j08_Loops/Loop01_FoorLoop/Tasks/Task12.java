package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamının print eden code create ediniz
         */

        Scanner input = new Scanner(System.in);

        System.out.print("sayı giriniz : ");

        int toplam=0;

        for (int i = 1; i <= 5; i++) {

            System.out.print(i + ". ci sayı giriniz : ");

            int sayi = input.nextInt();


            if (10 >= sayi || sayi >= 20) {

                toplam+=sayi;

            }

        }
        System.out.println("Girilen sayıların 10 ve 20 arası hariç toplamı = "+toplam);
    }
}
