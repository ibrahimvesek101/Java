package Digerleri.Elly_Code.src.weeklyTasks;

import java.util.Scanner;

public class _03TaskStringFor {
    public static void main(String[] args) {

/*

     Girilen Stringdeki tüm sesli harfleri saymak için bir Java Methodu yazınız.

    Test Data:
    java is fun

    Beklenen Çıktı:4
     */

        Scanner input = new Scanner(System.in);
        System.out.print("metin giriniz : ");
        String kelime = input.nextLine();

        String sesliler = "aeoöuüiAEOÖUÜIı";

        int sayac = 0;
        for (int i = 0; i <= kelime.length() - 1; i++) {

            Character harf = kelime.charAt(i);

            Character.valueOf(harf);

            String sesli = String.valueOf(harf);

            if (sesliler.contains(sesli)) {
                sayac++;

            }

        }
        System.out.println("Yazdığınız metindeki sesli harf sayısı = " + sayac);


    }

}
