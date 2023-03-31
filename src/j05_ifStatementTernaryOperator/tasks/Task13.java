package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /*
          TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz

         */

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 1. sayi giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("Lütfen 2. sayi giriniz : ");
        int sayi2 = input.nextInt();
        System.out.println("seçim yapınız\n+ için->1 seçiniz \n- için-> 2 seçiniz\n * için-> 3 seçiniz\n/ için-> 4 seçiniz");
        int islem = input.nextInt();


        if (islem == 1) {
            System.out.println(sayi1 + sayi2);

        } else if (islem == 2) {
            System.out.println(sayi1 - sayi2);

        } else if (islem == 3) {
            System.out.println(sayi1 * sayi2);

        } else if (islem == 4) {
            System.out.println(sayi1 / sayi2);
        } else {
            System.out.println("Ne istediğinizi kontrol ediniz.");

        }


    }
}
