package j05_ifStatementTernaryOperator;

import java.io.Serializable;
import java.util.Scanner;

public class sayi_mi {
    public static void main(String[] args) {


        /*
        TASK-> girilen yasın 18 den buyuklugunu kontrol eden code create ediniz
                18 den kuçuk ise ehliyet alamazsınız print ediniz
                */

        //     Scanner input = new Scanner(System.in);
        //     System.out.print("bir sayi giriniz :");
        //     int sayi1= input.nextInt();
//
        //  String sonuc=sayi1>0?"sayi pozitif":"sayi pozitif değil";
        //     System.out.println(sonuc);

   //     Scanner input = new Scanner(System.in);
   //     System.out.print("iki sayi giriniz :");
   //     int sayi1 = input.nextInt();
   //     int sayi2 = input.nextInt();
//
   //     String sonuc = sayi1 < sayi2 ? "büyük sayi = " + sayi2 : "büyük sayi = " + sayi1;
   //     System.out.println(sonuc);
//


        Scanner input = new Scanner(System.in);
        System.out.print("iki sayi giriniz :");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        Serializable serializable = ((sayi1 < 0 && sayi2 > 0) || (sayi1 > 0 && sayi2 < 0)) ? sayi1 + sayi2 : "agam devamkee";
        System.out.println(serializable);
    }

}