package Digerleri.Elly_Code.src.lesson04;

import java.util.Scanner;

public class Q06_ForLoop {

    /* Kullanicidan sayilar girmesini isteyin
     * ve girdigi sayilari toplayip yazdirin.
     * yeni sayi isteyin
     * girilen sayilarin toplami 100 'u gecerse
     * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int toplam = 0;
        int counter = 0;

        for (int i = 0; i <= 100; i++) {
            System.out.println("sayi giriniz :");
            counter++;
            int sayi = sc.nextInt();
            toplam+=sayi;

            if(toplam>100){
                System.out.println(counter + "... kere sayi girdin. Bu kadar sayi yeter");
                System.out.println("toplam = " + toplam);
                break;
            }
            System.out.println(toplam);
        }
    }

}
