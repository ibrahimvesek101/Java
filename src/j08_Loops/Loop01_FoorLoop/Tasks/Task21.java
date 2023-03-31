package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task21 {

    /*
             *
            * *
           * ! *
          * ! ! *
         * ! ! ! *
        * ! ! ! ! *
       * ! ! ! ! ! *
      * * * * * * * *
      şekli print eden code create ediniz.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz :");

        int sayi = input.nextInt();


        int bosluk = sayi - 1;
        int yildiz = 1;

        for (int i = 1; i <= sayi; i++) {
            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < yildiz; j++) {
                if (j == 0 || j == yildiz-1 || i == sayi) {
                    System.out.print("* ");

                } else System.out.print("! ");

            }
            bosluk--;
            yildiz++;
            System.out.println();
        }
    }

}
