package j06_SwitchStatement;

import java.util.Scanner;

public class C02_SwitchStatement {
    public static void main(String[] args) {

        System.out.print("Sayı ile bir ay giriniz : ");

        Scanner input = new Scanner(System.in);
        int secim = input.nextInt();


        switch (secim) {
            case 1:
                System.out.println("Ocak");
                break;

            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
            case 12:
                System.out.println("Aralık");
            default:
                System.out.println("Hatalı tuşlama yaptınız");


        }
    }
}
