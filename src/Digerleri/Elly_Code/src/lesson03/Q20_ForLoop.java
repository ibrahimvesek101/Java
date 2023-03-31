package Digerleri.Elly_Code.src.lesson03;

import java.util.Scanner;

public class Q20_ForLoop {

    // Kullanicidan iki sayi isteyin.
    // Girilen sayilar ve aralarindaki tum
    // tamsayilari toplayip, sonucu yazdiran bir program yaziniz
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("ikinci sayıyı giriniz : ");
        int sayi2 = input.nextInt();

        int toplam=0;

        for (int i =Math.min(sayi1,sayi2); i <= Math.max(sayi1,sayi2); i++) {

            toplam=toplam+i;

        }
        System.out.println(toplam);

    }

}
