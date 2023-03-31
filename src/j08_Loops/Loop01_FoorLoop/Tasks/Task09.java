package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
           /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * *

         */

        Scanner input = new Scanner(System.in);

        System.out.print("sayı giriniz : ");

        int sayi = input.nextInt();

        String yildiz="* ";

        for (int i = 1; i <=sayi ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(yildiz);

            }
            System.out.println();
        }

    }
}
