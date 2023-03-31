package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // task-> girilen şifrenin asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" print edin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        Scanner input = new Scanner(System.in);


        int kontrol = 0; //kontrol 1 oluncaya(şifre doğru oluncaya) kadat while çalış.

        while (kontrol == 0) {

            System.out.print("Lütfen şifre giriniz : ");
            String parola = input.nextLine();

            if (Character.isLowerCase(parola.charAt(0))) {
                if (Character.isDigit(parola.charAt(parola.length() - 1))) {
                    if (!(parola.contains(" "))) {
                        if (parola.length() >= 10) {
                            kontrol = 1;
                        } else {
                            System.out.println("Şifre en az 10 karakterden oluşmalı");

                        }

                    } else {
                        System.out.println("Şifre boşluk içermemeli");

                    }

                } else {
                    System.out.println("Son karakter sayı olmalı");

                }

            } else {
                System.out.println("İlk harf küçük olmalı");

            }

        }
        System.out.println("Şifre basariyla kaydedildi\nbu kadar yardımdan sonra bi zahmet yani :)");

    }
}
