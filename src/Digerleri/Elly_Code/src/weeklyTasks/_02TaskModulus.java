package Digerleri.Elly_Code.src.weeklyTasks;

import java.util.Scanner;

public class _02TaskModulus {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi :  5
         *          Girdiginiz sayinin yuzler basamagi : 8

         */
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print("3 basamakli bir sayi giriniz : ");

            int sayi = scan.nextInt();

            // 1 ler basamgı-> bir sayinin 10 bolumunden kalan 1 ler basmagidir..
            int birler = sayi % 10;//sayinin birler basamagı
            sayi /= 10;// sayi 10 bolumunden bolumu verir 853/10->85
            int onlar = sayi % 10;// 85in 10 bolumunden kalan->5
            int yüzler = sayi / 10;// 85'in 10' a bolumu ->8

            System.out.println("Girdiginiz sayinin birler basamagi :"+birler+"\nGirdiginiz sayinin onlar basamagi : "+onlar
                    +"\nGirdiginiz sayinin yuzler basamagi :"+yüzler);
        }


}
