package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // Task-> girilen 7 sayının en buyugunu print eden code create ediniz

        Scanner input = new Scanner(System.in);


        int sayac = 1;
        int buyukSayi = 0;

        while (sayac <= 7) {
            System.out.print("sayı giriniz : ");
            int sayi2 = input.nextInt();

            buyukSayi = Math.max(buyukSayi, sayi2);

            sayac++;
        }
        System.out.println(buyukSayi);

    }
}
