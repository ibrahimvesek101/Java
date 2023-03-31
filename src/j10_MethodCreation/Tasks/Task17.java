package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        /*
            Task-> girilen bir tamsayıyı  tersinden print eden METHOD create ediniz
            input:1453
            output:3541

         */
        teriniHeaspla();
    }

    private static void teriniHeaspla() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();

        String strSayi = String.valueOf(sayi);

        String tersSayi = "";
        for (int i = strSayi.length() - 1; i >= 0; i--) {

            tersSayi += strSayi.charAt(i);

        }

        int tersSayiInt = Integer.parseInt(tersSayi);

        System.out.println(tersSayiInt);
    }

}

