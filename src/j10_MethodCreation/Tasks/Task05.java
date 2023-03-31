package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task05 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // // task-> girilen iki sayıyı seçilen dört işleme göre
        // hesaplayıp print eden METHOD create ediniz


        dortİslem();
    }

    private static void dortİslem() {
        System.out.print("1. sayıyı giriniz : ");
        double sayi1 = input.nextDouble();

        System.out.print("2. sayıyı giriniz : ");
        double sayi2 = input.nextDouble();

        System.out.print("İşlem seçiminizi giriniz : ");

        char islem = input.next().charAt(0);

        switch (islem) {
            case '+':
                topla(sayi1, sayi2);
                break;

            case '-':
                cikar(sayi1, sayi2);
                break;

            case '*':
                carp(sayi1, sayi2);
                break;

            case '/':
                bol(sayi1, sayi2);
                break;
            default:
                System.out.println("Yanlış giriş yaptınız");

        }

    }

    private static void bol(double sayi1, double sayi2) {
        System.out.println("sayi1 / sayi2 = " + (sayi1 / sayi2));

    }

    private static void carp(double sayi1, double sayi2) {
        System.out.println("sayi1 x sayi2 = " + (sayi1 * sayi2));

    }

    private static void cikar(double sayi1, double sayi2) {
        System.out.println("sayi1-sayi2 = " + (sayi1 - sayi2));

    }

    private static void topla(double sayi1, double sayi2) {
        System.out.println("sayi1+sayi2 = " + (sayi1 + sayi2));
    }

}
