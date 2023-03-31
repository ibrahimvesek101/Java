package Digerleri.Elly_Code.src.lesson04;

import java.util.Scanner;

public class Q08_Continue {
    /*
    // break ve continue sadece içinde bulunduğu döngüyü etkiler.
    Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
    atlar ve loop’un bir sonraki değerinden devam eder.
     */

    // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
    // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bir string giriniz : ");
        String ifade = sc.nextLine();

        for (int i = 0; i < ifade.length(); i++) {
            if(ifade.charAt(i) == 'a'  || ifade.charAt(i) == ' ' )
                continue; //atla devam et
            System.out.print(ifade.charAt(i) + " ");
        }


    }

}
