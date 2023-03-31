package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _24_Scanner3 {

    public static void main(String[] args) {

     /*   Bir String oluşturun.
          Konsol'a sevdiğiniz bir meyveyi yazın.
          O meyveyi yazdırınız.   */

        //Kodu aşağıya  yazınız.

        Scanner scanner = new Scanner(System.in);
        String meyve;
        System.out.print("Sevdiğiniz meyve: ");
        meyve = scanner.nextLine();
        System.out.println("Sevdiğin meyve: " + meyve);
    }
}
