package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */


        Scanner input = new Scanner(System.in);

        int sayi = 1;
        int sayac = 0;
        int toplam = 0;

        while (!(sayi == 0)) {

            System.out.print("sayı giriniz : ");
            sayi = input.nextInt();

            toplam = toplam + sayi;
            sayac++;


        }
        System.out.println("toplam " + sayac + " sayı girildi.\nToplamları = " + toplam);


    }
}
