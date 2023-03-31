package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _23_Scanner2 {

    public static void main(String[] args) {

    /*    Bir int oluşturun.
          Konsol'a herhangi bir sayı giriniz.
          Bu sayıyı yazdırın.   */

        //Kodu aşağıya  yazınız.

        Scanner scanner = new Scanner(System.in);

        int sayi;
        System.out.print("Bir sayı girin: ");
        sayi = scanner.nextInt();
        System.out.println("Sayı: " + sayi);


    }
}
