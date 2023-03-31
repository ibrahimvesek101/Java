package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        /*
    task-> girilen bir tamsayının basamak sayısını print eden METHOD create ediniz.
    */


        basamakSayisiniSay();

    }

    private static void basamakSayisiniSay() {

        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        int sayi = input.nextInt();

        System.out.println("Girilen sayının basamak sayısı = "+(String.valueOf(sayi).length()));


    }
}
