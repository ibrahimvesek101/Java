package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _29_Scanner9 {

    public static void main(String[] args) {

    /*    Bir float oluşturunuz.
          Konsola boyunuzu giriniz.
          Float'ı yazdırınız.   */

        //Kodu aşağıya yazınız.

        Scanner scanner = new Scanner(System.in);

        float boy;

        System.out.print("Boyunuz (Örnek 1.75): ");
        boy = scanner.nextFloat();

        System.out.println("Boyunuz= " + boy);


    }


}
