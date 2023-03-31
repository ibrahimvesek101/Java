package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz :");

        int sayi = input.nextInt();

        String yildiz = "* ";

        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(yildiz);

            }
            System.out.println();
        }
        for (int i = sayi - 1; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(yildiz);

            }
            System.out.println();
        }
    }
}