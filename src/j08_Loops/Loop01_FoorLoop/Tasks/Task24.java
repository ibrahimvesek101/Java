package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task24 {

    public static void main(String[] args) {
		/*
		 Task -> girilen  String'in tersini(reverse String) print eden code create ediniz
		 */

        Scanner input = new Scanner(System.in);

        System.out.print("kelime giriniz : ");

        String kelime = input.nextLine();

        String tersKelime = "";


        for (int a = kelime.length() - 1; 0 <= a; a--) {

            char harf = kelime.charAt(a);

            tersKelime = tersKelime + harf;
        }

        System.out.println(tersKelime);


        // 2.yöntem



        String str = input.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {// strnin son karakterinden 0. karaktere bir tekrar tanımlandı
            System.out.print(str.charAt(i));
        }
        System.out.println("   ***   ");

        //3.yöntem:


        for (int i = 0; i <= str.length() - 1; i++) {// strnin son karakterinden 0. karaktere bir tekrar tanımlandı
            System.out.print(str.charAt(str.length() - 1 - i));
        }


    }

}