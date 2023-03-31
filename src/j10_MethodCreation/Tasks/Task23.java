package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task23 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /*
        Task-> vucüt kitleendexini print eden METHOD create ediniz
        vki->kg(mt*mt)
     18,5 kg/m2 ve daha düşük değerler = Zayıf.
     18,5 ve 24,9 kg/m2 arasındaki değerler = Normal ağırlıkta.
     25,0 ve 29,9 kg/m2 arasındaki değerler = Kilolu.
     30,0 ve üstü =  obezite.

         */

        vkiHesapla();


    }//main sonu

    private static void vkiHesapla() {
        System.out.print("kilonuzu kg olarak giriniz : ");
        double kilo = input.nextDouble();
        System.out.print("boy uzunluğunuz  metre olarak giriniz : ");
        double boy = input.nextDouble();

        System.out.println("vki = " + (kilo / (boy * boy)));
        if (kilo / (boy * boy) <= 18.5) {
            System.out.println("bizim olan FİT sin gari ");
        } else if (kilo / (boy * boy) <= 24.9) {
            System.out.println("bizim olan NORMAL sin gari ");
        } else if (kilo / (boy * boy) <= 29.9) {
            System.out.println("bizim olan HAMIR yeme  gari ");
        } else System.out.println("bizim olan mezarda kurtlar sevinsin gari ");

    }

}
