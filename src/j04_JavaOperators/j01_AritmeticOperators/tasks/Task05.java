package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task05 {

    /*
    Task->
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen saati giriniz : ");
        int saat = scan.nextInt();

        System.out.println("Lütfen dakikayı giriniz : ");
        int dakika = scan.nextInt();

        System.out.println("Lütfen saniyeyi giriniz : ");
        int saniye = scan.nextInt();

        int toplamSaniye = saat * 3600 + dakika * 60 + saniye;
        System.out.println("Toplam saniye : "+ toplamSaniye);
    }

}
