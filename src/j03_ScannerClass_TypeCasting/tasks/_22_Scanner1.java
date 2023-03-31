package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _22_Scanner1 {

    public static void main(String[] args) {

    /*    Bir String oluşturun.
          Konsol'a isminizi girin.
          İsminizi yazdırın.  */

        //Kodu aşağıya  yazınız.

        Scanner scanner = new Scanner(System.in);
        String ad;
        System.out.print("İsminizi girin: ");
        ad = scanner.nextLine();
        System.out.println("İsminiz: " + ad);


    }
}
