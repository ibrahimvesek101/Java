package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Faktoriyelini almak istediğiniz sayıyı giriniz : ");
        int sayi = input.nextInt();

        int faktoriel = 1;

        for (int i = 1; i <= sayi; i++) {

            faktoriel *= i;

        }
        System.out.println("girilen sayının faktöriyeli = " + faktoriel);
    }
}
