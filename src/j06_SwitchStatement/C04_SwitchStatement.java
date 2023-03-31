package j06_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchStatement {

    public static void main(String[] args) {

        // Task-> Girilen ay numarasına göre mevsimini print eden code create ediniz...

        Scanner input = new Scanner(System.in);
        System.out.print("Bir ayın sayisini giriniz : ");
        int aySayi = input.nextInt();
        switch (aySayi) {

            case 12:
            case 1:
            case 2:
                System.out.println("girilen ay KIŞ mevsimine aittir.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("girilen ay İLKBAHAR mevsimine aittir.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("girilen ay YAZ mevsimine aittir.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("girilen ay SONBAHAR mevsimine aittir.");
                break;

            default://switch hiç bir case için calışmzsa devreye girer.switch blok'da yeri önemli değildir.
                System.out.println("lütfen doğru bir giriş yapınız ");
                break;

        }
    }
}



