package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _27_Scanner6 {

    public static void main(String[] args) {

    /*    Bir string oluşturunuz.
          Doğum gününüzü konsola giriniz.
          String'i yazdırınız.  */

        //kodu aşağıya yazınız.

        Scanner scanner = new Scanner(System.in);
        String dogum;
        System.out.print("Doğum gününüzü giriniz: ");
        dogum = scanner.nextLine();
        System.out.println("Doğum gününüz: " + dogum);

    }
}
