package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {


        // task-> istenilen kadar tamsayının toplamını print eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        int sayi = input.nextInt();


        int basla = 0;
        int toplam = 0;

        while (basla <= sayi) {

            toplam = toplam + basla;


            basla++;

        }
        System.out.println(sayi + " sayısına kadar olan sayıların toplamı = " + toplam);

    }

}
