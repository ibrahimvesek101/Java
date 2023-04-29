package Projeler.Kendi_Calısmalarım.DepoProjesi;

import java.util.Scanner;

public class Int_Kontrol {
    static Scanner input = new Scanner(System.in);

    public static int intSayiKontrol() {
        int sayi;
        while (true) {
            try {
                sayi = Integer.parseInt(input.next());  //integer giris yapilana kadar while
                return sayi;
            } catch (Exception e) {
                System.out.print("Girişiniz bir sayı olmalı. Lutfen bir sayı tuslayin: ");
            }
        }

    }
}


