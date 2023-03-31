package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task29 {

    public static void main(String[] args) {
        // task-> girilen bir Stringde  index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle print eden code create ediniz
        // ornek : Java  output: JaVa


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir kelime giriniz");

        String str = input.nextLine();

        for (int i = 0; i < str.length(); i++) {

            if (i % 2 == 0) {

                System.out.print(str.toUpperCase().charAt(i));

            } else System.out.print(str.toLowerCase().charAt(i));
        }

    }
}