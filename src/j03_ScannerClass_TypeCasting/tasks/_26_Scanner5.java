package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _26_Scanner5 {

    public static void main(String[] args) {

    /*    Bir String oluştur.
          Konsol'a 10 sene önceki yaşadığın şehri yazın.
          Bu String'i yazdırın.   */

        //Kodu aşağıya  yazınız.

        Scanner scanner = new Scanner(System.in);
        String sehir;
        System.out.print("10 sene önce yaşadığınız şehri yazınız: ");
        sehir = scanner.nextLine();
        System.out.println("10 sene önce yaşadığınız şehir: " + sehir);

    }
}
