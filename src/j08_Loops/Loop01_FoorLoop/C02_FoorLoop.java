package j08_Loops.Loop01_FoorLoop;

import java.util.Scanner;

public class C02_FoorLoop {
    public static void main(String[] args) {
        // task-> girilen sayıdan 100 e kadar 4ûn katı olan tamsayılerı print eden code create ediniz...

        Scanner input=new Scanner(System.in);
        System.out.print("bizim gızzz bi sayı gir bakennn : ");
        int sayi=input.nextInt();
        if (sayi>=100) {
            System.out.println("hatalı giriş :(");
        }else {
            for (int i = sayi; i <100 ; i++) {
                if ( i%4==0) {
                    System.out.print(i+" ");
                }
            }
        }



    }
}