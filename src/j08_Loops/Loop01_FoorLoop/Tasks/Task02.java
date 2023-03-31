package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Objects;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* task-> Digerleri.interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.

         */

        Scanner input = new Scanner(System.in);

        System.out.print("kelime giriniz : ");

        String kelime = input.nextLine();// ahmet

        String tersKelime = "";


        for (int a = kelime.length() - 1; 0 <= a; a--) {

            char harf = kelime.charAt(a);

            tersKelime = tersKelime + harf;
        }

        if (kelime.equals(tersKelime)) {

            System.out.println("Yazdığınız kelime POLİNDROME dir.");


        } else System.out.println("Yazdığınız kelime POLİNDROME değildir.");

    }
}


