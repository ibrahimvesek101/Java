package j06_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {


// verilen bir rakamın harf karakteri print eden bir kod create edelim


        System.out.print("Bir rakam giriniz : ");

        Scanner input = new Scanner(System.in);
        int secim = input.nextInt();


        switch (secim) {
            case 0:
                System.out.println("Sıfır");
                break;

            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("Dört");
                break;
            case 5:
                System.out.println("Beş");
                break;
            case 6:
                System.out.println("Altı");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
                break;
            default:
                System.out.println("Hatalı tuşlama yaptınız");


        }
    }
}
