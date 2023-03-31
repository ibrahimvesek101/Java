package Day05;

import java.util.Scanner;

public class Q09_TreeShape {
    // Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu
    // kullanicidan aliniz..
    // Not :govde sabit sayi olsun
    /* tac uzunlugu -> 6 iken

    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    ^^^^^^
    |||
    |||
    |||
    |||
    |||
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ağacın taç uzunluğu ? : ");
        int uzunluk = scanner.nextInt();
        String tac="";
        for (int i = 0; i <uzunluk ; i++) {
            tac += "^";
            System.out.println(tac);
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println("|||");
        }


    }



}
