package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter
		  sayısını print eden code create ediniz.
		do-While loop
		 */

        Scanner input = new Scanner(System.in);
        System.out.print("metin giriniz : ");
        String metin = input.nextLine().toLowerCase(Locale.ROOT);//küçük karaktere çevrildi.

        int harfSay = 0;
        int rakamSay = 0;
        int karakterSay = 0;
        int metinIndex = 0;
        do {
            if (metin.length() == 0) { //""
                System.out.println("bir daha metin giriniz.");

            } else if (metin.charAt(metinIndex) >= 'a' && metin.charAt(metinIndex) <= 'z') {
                harfSay++;

            } else if (metin.charAt(metinIndex) >= '0' && metin.charAt(metinIndex) <= '9') {

                rakamSay++;
            } else {
                karakterSay++;
            }

            metinIndex++; //loop sonunda arttır.
        } while (metinIndex < metin.length());// loop metin index metinin boyutundan küçük old.sürece.

        System.out.println("Girdiğiniz metinde " + harfSay + " tane harf var");
        System.out.println("Girdiğiniz metinde " + rakamSay + " tane rakam var");
        System.out.println("Girdiğiniz metinde " + karakterSay + " tane karakter var");

    }

}
