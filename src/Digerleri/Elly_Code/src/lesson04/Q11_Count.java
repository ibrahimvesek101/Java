package Digerleri.Elly_Code.src.lesson04;

import java.util.Scanner;

public class Q11_Count {
    /*
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     *
     * ORNEK:
     *
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen bir cumle girinz : ");
        String cumle = scanner.nextLine().toLowerCase();

        System.out.println("saydirmak istediginiz karakter : ");
        char harf = scanner.next().toLowerCase().charAt(0);

        int counter = 0;

        for (int i = 0; i < cumle.length(); i++) {
            if(cumle.charAt(i) == harf){
                counter++;
            }
        }
        System.out.println("girdigniz cumlede " + harf + " harfi " + counter+ " kere kullanilmistir");

    }

}
