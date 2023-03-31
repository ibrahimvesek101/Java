package j09_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {


        // girilen asal mı???


        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        int sayi = input.nextInt();

boolean asalMi=true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi=false;
                break;
            }

        }if (asalMi){
            System.out.println("Sayı asaldır.");
        }else System.out.println("Sayı asal değil.");

    }
}
