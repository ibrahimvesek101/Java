package j10_MethodCreation.Tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task06 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
// Task-> Girilen iki boyuta göre seçilen geometrik şeklin
// (kare, dikdortgen,üçgen) alan ve çevresini hesaplayan METHOD??

        geometrikHesapla();


    }

    private static void geometrikHesapla() {


        System.out.print("1. sayıyı giriniz : ");
        double sayi1 = input.nextDouble();

        System.out.print("2. sayıyı giriniz : ");
        double sayi2 = input.nextDouble();

        System.out.print("Geometrik şekil seçiminizi giriniz : ");

        String geoSekil = input.next().toLowerCase();

        switch (geoSekil) {

            case "kare":

                kareAlanHesapla(sayi1, sayi2);
                kareCevreHesapla(sayi1, sayi2);

                break;

            case "dikdörtgen":

                dikdorgenAlanHesapla(sayi1, sayi2);
                dikdortgenCevreHesapla(sayi1, sayi2);
                break;

            case "üçgen":

                ucgenAlanHesapla(sayi1, sayi2);
                ucgenCevreHesapla(sayi1, sayi2);
                break;

            default:
                System.out.println("Hatalı giriş yaptınız.");
        }

    }

    private static void ucgenCevreHesapla(double sayi1, double sayi2) {
        System.out.println("Üçüncü kenarı giriniz : ");
        int ucuncuKenar = input.nextInt();

        System.out.println("üçgenin çevresi = " + (sayi1 + sayi2 + ucuncuKenar));

    }

    private static void ucgenAlanHesapla(double sayi1, double sayi2) {
        System.out.println("girdiğiniz 1.kenara ait yükseklik giriniz.");
        int yukseklik = input.nextInt();

        System.out.println("üçgenin alanı = " + ((sayi1 * yukseklik) / 2));
    }

    private static void dikdortgenCevreHesapla(double sayi1, double sayi2) {
        System.out.println("dikdörtgen çevre = " + ((sayi1 + sayi2) * 2));

    }

    private static void dikdorgenAlanHesapla(double sayi1, double sayi2) {
        System.out.println("dikdörtgen alan = " + (sayi1 * sayi2));

    }

    private static void kareCevreHesapla(double sayi1, double sayi2) {

        if (sayi1 == sayi2) {
            System.out.println("Karenin Çevresi= " + (sayi1 * 4));

        } else System.out.println("karede kenarlar eşit olmalı");


    }

    private static void kareAlanHesapla(double sayi1, double sayi2) {
        if (sayi1 == sayi2) {
            System.out.println("karenin alanı " + (sayi1 * sayi2));

        } else System.out.println("karede kenarlar eşit olmalı");


    }
}
