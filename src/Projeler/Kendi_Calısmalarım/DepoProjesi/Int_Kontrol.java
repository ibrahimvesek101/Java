package Projeler.Kendi_Calısmalarım.DepoProjesi;

import java.util.Scanner;

public class Int_Kontrol {
    static Scanner input = new Scanner(System.in);

    public static int sayıAlKontrolEt() {

        boolean bayrak = true;
        int sayi = 0;

        System.out.print("Sayı giriniz : ");
        while (bayrak) {
            try {
                sayi = Integer.parseInt(input.nextLine());
                bayrak = false;
            } catch (Exception e) {
                System.out.println("Yanlış giriş. Lütfen bir sayı giriniz : ");
            }
        }
        return sayi;
    }
}

