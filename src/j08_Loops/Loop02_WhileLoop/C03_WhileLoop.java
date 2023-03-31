package j08_Loops.Loop02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("sayı giriniz : ");

        int sayi = input.nextInt();


        //       Scanner input= new Scanner(System.in);
//
        //       System.out.print("metin giriniz : ");
//
        //       String kelime = input.nextLine();
//


//  task-> Girilen sayının tamsayı bölenlerini bulalım:

        int bolenSayi = 1;
        int sayac = 0;

        while (bolenSayi <= sayi) {

            if (sayi % bolenSayi == 0) {

                sayac++;

            }
            bolenSayi++;

        }

        System.out.print(sayac);
    }
}
