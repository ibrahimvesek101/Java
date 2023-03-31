package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

// Girilen ad ve soyadın ilk harfleri büyük
// diğer harlerini küçük Method create ediniz.

        Scanner input = new Scanner(System.in);

        System.out.print("Adınızı giriniz : ");
        String ad = input.nextLine();

        System.out.print("Soyadınızı giriniz : ");
        String soyad = input.nextLine();

        adSoyadHarfContro1l(ad, soyad);

        System.out.println("*** 2. yöntem ***");
        System.out.println(adSoyadHarfContro2(ad, soyad));

    }

    private static void adSoyadHarfContro1l(String ad, String soyad) {
        System.out.println(ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase());
        System.out.println(soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase());

    }

    // return lu olan;  2.method...


    private static String adSoyadHarfContro2(String ad, String soyad) {
        return ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase() + " " +
                soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase();

    }
}
