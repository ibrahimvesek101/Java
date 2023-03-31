package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

// girilen iki sayının eşitliğini kontrol eden Method create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz : ");
        int sayi1 = input.nextInt();

        System.out.print("2.sayıyı giriniz : ");
        int sayi2 = input.nextInt();

        System.out.println(esitMi(sayi1, sayi2));

    }

    public static boolean esitMi(int sayi1, int sayi2) {
        boolean esit = true;
        if (sayi1 == sayi2) {


        } else {
            esit = false;

        }
        return esit;

    }
}
