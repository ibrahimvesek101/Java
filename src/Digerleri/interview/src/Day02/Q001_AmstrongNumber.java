package Digerleri.interview.src.Day02;

import java.util.Scanner;

public class Q001_AmstrongNumber {
     /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami
         o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          Soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
          amstrong sayı olup olmadıgını gösteren program yazınız */
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Bir sayi giriniz :");
         int sayi = scan.nextInt();
         for (int i = 1; i <=sayi ; i++) {
             amstrongCheck(i);
         }

     }
// 153
    private static void amstrongCheck(int sayi) {
        int sayilarinKupToplami = 0;
        int ilkSayi=sayi;
         while(sayi>0){
             int basmaktakiSayi = sayi%10;
             sayilarinKupToplami +=basmaktakiSayi*basmaktakiSayi*basmaktakiSayi;
             sayi /=10; // sayi = sayi /10;
         }
         if (sayilarinKupToplami==ilkSayi){
             System.out.println(ilkSayi+" Amstrong Sayıdır");
         } else {
           //  System.out.println(ilkSayi+" Amstrong Değildir");
         }

    }


}
