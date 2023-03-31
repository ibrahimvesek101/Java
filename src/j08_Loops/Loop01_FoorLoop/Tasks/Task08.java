package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
/*
        task-> girilen boyutta kare çarpım tablosu print eden code create ediniz
          Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       5x5
         */
        Scanner input=new Scanner(System.in);
        System.out.print("bizim gızzz birinç sayı gir bakennn : ");
        int boyut=input.nextInt();

        for (int crpn1 = 1; crpn1 <=boyut ; crpn1++) {//kat tekrarı
            for (int crpn2 = 1; crpn2 <=boyut ; crpn2++) {//daire tekrarı
                System.out.print((crpn1*crpn2)+"\t");
            }
            System.out.println();//dumy
        }
    }
}