package Digerleri.teamExtra;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {


    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        /* Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * Örnek:  input            output
         *  1 -    elma  2           eaea
         *  2 -    army  3           ayayay

         */

        System.out.println("Lütfen bir cümle giriniz");
        String input = scan.nextLine();

        System.out.println("lütfen bir sayı giriniz");
        int tekrar = scan.nextInt();
        for (int i = 0; i <tekrar; i++) {
            System.out.print(input.substring(0,1)+input.substring((input.length()-1), input.length()));

        }
    }
}