package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print eden code create ediniz

		 */
        Scanner input = new Scanner(System.in);
        System.out.print("isminizi ve soyisminizi giriniz : ");
        String metin = input.nextLine();

        int basla = 0;

        while (basla < metin.length()) {

            System.out.print(metin.charAt(basla));
            System.out.print(" ");

            basla++;
        }
    }

}
