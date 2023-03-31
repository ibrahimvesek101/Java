package j06_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchStatement {

    public static void main(String[] args) {

        // Task-> Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...

        Scanner input = new Scanner(System.in);
        System.out.print("Bir ayın sayisini giriniz : ");
        int aySayi = input.nextInt();
        switch (aySayi) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girilen ayda 31 gün  vardır");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girilen ayda 30 gün  vardır");
                break;
            case 2:
                System.out.print("lütfen yıl giriniz :");
                int yil = input.nextInt();
                //if (yil % 4 == 0) {
                //    System.out.println("girilen ayda 29 gün vardır");
                //} else System.out.println("girilen ayda 28 gün vardır");
                System.out.println(yil % 4 == 0 ? "girilen ayda 29 gün vardır" : "girilen ayda 28 gün vardır");
                break;
            default://switch hiç bir case için calışmzsa devreye girer.switch blok'da yeri önemli değildir.
                System.out.println("lütfen doğru bir giriş yapınız ");
                break;

        }
    }
}



