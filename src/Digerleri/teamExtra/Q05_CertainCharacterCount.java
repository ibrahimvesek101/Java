package Digerleri.teamExtra;
import java.util.Scanner;
public class Q05_CertainCharacterCount {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        /* Kullanicidan bir cumle ve bir harf alin, Cumlede harfin kac kere kullanildigini bulup, yazdirin
         * ORNEK:
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */
        System.out.println("Lütfen bir cümle giriniz");
        String cümle = scan.nextLine();
        System.out.println("Lütfen aratmak istediğiniz harfi giriniz");
        String karakter= scan.nextLine();
        char aranan = karakter.charAt(0);
        int sayac=0;
        for (int i = 0; i < cümle.length(); i++) {
            if(cümle.charAt(i) == aranan) {
                sayac++;
            }
        }
        System.out.println("girdiğiniz cümlede " + karakter.charAt(0) + " harfi " + sayac + " kere kullanılmıştır");
    }
}