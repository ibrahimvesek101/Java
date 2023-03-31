package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
             /* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
        (kişi iki adı olursa -kendim iki isimli yaptım-)
         */
                Scanner input = new Scanner(System.in);
                System.out.print("Lütfen adınızı giriniz : ");
                String adi = input.nextLine();
                System.out.print("Lütfen soyadınızı giriniz : ");
                String soyadi = input.nextLine();

                String ilkHarfadi = String.valueOf(adi.charAt(0));
                String buyukHarfadi = ilkHarfadi.toUpperCase();

                String ikinciAd = adi.substring(adi.indexOf(" ") + 1);
                Character ikinciBasharf = ikinciAd.charAt(0);
                Character buyukHarfikinci = Character.toUpperCase(ikinciBasharf);

                String ikinciAdkalan = adi.substring(adi.indexOf(" ") + 2);

                String ilkHarfsoyadi = String.valueOf(soyadi.charAt(0));
                String buyukHarfsoyadi = ilkHarfsoyadi.toUpperCase();

                System.out.println((buyukHarfadi + adi.substring(1, adi.indexOf(" ")) + " " + (buyukHarfikinci + ikinciAdkalan) + " " +
                        (buyukHarfsoyadi + soyadi.substring(1))));

            }
        }