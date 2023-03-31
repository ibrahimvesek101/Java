package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        // girilen saati saniyeye mil'i km 'ye kg gr a çeviren method create edelim;

        Scanner input = new Scanner(System.in);
        System.out.print("Dönüştüreceğiniz birimin ismini giriniz : ");
        String birim = input.nextLine();  //saat mil kg


        System.out.print("Dönüştüreceğiniz birimin miktarını giriniz :  ");
        double miktar = input.nextDouble();// saat mil km
        donustur(birim, miktar);

    }

    private static void donustur(String birim, double miktar) {

        switch (birim) {
            case "saat":
                System.out.println("Girilen saat " + (miktar * 60 * 60) + " saniye");
                break;

            case "mil":
                System.out.println("Girilen mil " + (miktar * 1.6) + " km");
                break;

            case "kg":
                System.out.println("Girilen kg " + (miktar * 1000) + " gram");
                break;

            default:
                System.out.println("Hatalı giriş yaptınız.");
        }
    }
}
