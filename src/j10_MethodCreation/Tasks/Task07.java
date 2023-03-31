package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task07 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

//Task-> Girilen 3 sayıdan küçük olanı prınt eden METHOD

        enKucukBul();

    }

    private static void enKucukBul() {

        System.out.print("1. sayıyı giriniz : ");
        double sayi1 = input.nextDouble();

        System.out.print("2. sayıyı giriniz : ");
        double sayi2 = input.nextDouble();

        System.out.print("3. sayıyı giriniz : ");
        double sayi3 = input.nextDouble();


        System.out.println(sayi1 < sayi2 ? (sayi1 < sayi3 ? (sayi1) : (sayi3)) : (sayi2 < sayi3 ? sayi2 : sayi3));
    }
}
