package Digerleri.interview.src.Day01;

import java.util.Scanner;

public class Q05_CertainCharacterCount {
    /* Kullanicidan bir cumle ve bir harf alin, Cumlede harfin kac kere kullanildigini bulup, yazdirin
     * ORNEK:
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir cumle giriniz :");
        String cumle = scan.nextLine();

        System.out.print("Harf giriniz :");
       // char harf = scan.next().charAt(0);
        String harf = scan.next().substring(0,1); //
        int counter=0;
        for (int i = 0; i <cumle.length() ; i++) {
        //    if(cumle.charAt(i) == harf) counter++;
            if(cumle.substring(i,i+1).equals(harf)) counter++; //
        }


        System.out.println(counter);
    }

}
