package Digerleri.CananHoca.Mart23Tasks;

import java.util.Scanner;

public class T02_IkininKuvveti {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını
         * kontrol eden PowersofTwo(num) methodu create ediniz.
         *
         *
         * input = 2
         * output = true
         *
         *
         * input2 = 10
         * output = false
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int num = scan.nextInt();

        PowersofTwo(num);
        System.out.println(PowersofTwo(num));

    }

    private static boolean PowersofTwo(int num) {
        boolean ikininKuvvetiMi=false;

        for (int i = 1; i < Integer.MAX_VALUE; i = i * 2) {
            // i sadece ikinin kuvvetlerini dolaşacak
            // 2,4,8,16,32
            // döngü integer limitinin sonuna kadar gitsin

            if (num == i) {
                // i sadece 2 nin kuvveti olabileceği için,
                // num i'ye eşit olduğu anda num'un ikinin kuvveti olduğunu anlarız

                ikininKuvvetiMi=true;
                break;
            }
            if ( num < i) {
                break;
            }

        }
        return ikininKuvvetiMi;

    }
}
