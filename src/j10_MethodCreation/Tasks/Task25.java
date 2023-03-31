package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {

        //task-> girilen sayını faktoriyelini print eden METHOD create ediniz

        Scanner input = new Scanner(System.in);
        System.out.print("Faktöriyelini hesaplamak istediğiniz sayıyı giriniz : ");
        int sayi = input.nextInt();

        System.out.println(faktoriyelHesapla(sayi));

    }

    private static int faktoriyelHesapla(int sayi) {

        if (sayi >= 1) {
            return sayi * faktoriyelHesapla(sayi - 1);
        } else return 1;
    }
}

