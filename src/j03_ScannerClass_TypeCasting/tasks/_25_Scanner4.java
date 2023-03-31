package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _25_Scanner4 {

    public static void main(String[] args) {

    /*    Bir int oluştur.
          Konsol'a arabanızdaki kapı sayısını girin.
          Bu int'i yazdırın.  */

        //Kodu aşağıya  yazınız.

        Scanner scanner = new Scanner(System.in);
        int kapi_sayisi;
        System.out.print("Arabanızdaki kapı sayısı: ");
        kapi_sayisi = scanner.nextInt();
        System.out.println("Arabanız " + kapi_sayisi + " kapılıdır.");


    }
}


