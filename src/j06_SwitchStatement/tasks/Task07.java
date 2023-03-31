package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
// Task-> Girilen 3 basamaklı bir sayıyı hardf karakteri ile print eden code create ediniz.

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen üç basamaklı bir sayı giriniz : ");
        int sayi = scan.nextInt();

        int birler = (sayi % 10);
        int onlar = (sayi / 10) % 10;
        int yuzler = (sayi / 100);

        switch (yuzler) {
            case 1:
                System.out.println(" Yüz");
                break;
            case 2:
                System.out.println(" İkiyüz");
                break;
            case 3:
                System.out.println(" Üçyüz");
                break;
            case 4:
                System.out.println(" Dörtyüz");
                break;
            case 5:
                System.out.println(" Beşyüz");
                break;
            case 6:
                System.out.println(" Altıyüz");
                break;
            case 7:
                System.out.println(" Yediyüz");
                break;
            case 8:
                System.out.println(" Sekizyüz");
                break;
            case 9:
                System.out.println(" Dokuzyüz");
                break;
        }


        switch (onlar) {
            case 1:
                System.out.println(" on");
                break;
            case 2:
                System.out.println(" yirmi");
                break;
            case 3:
                System.out.println(" otuz");
                break;
            case 4:
                System.out.println(" kırk");
                break;
            case 5:
                System.out.println(" elli");
                break;
            case 6:
                System.out.println(" altmış");
                break;
            case 7:
                System.out.println(" yetmiş");
                break;
            case 8:
                System.out.println(" seksen");
                break;
            case 9:
                System.out.println(" doksan");
                break;
        }
        switch (birler) {
            case 1:
                System.out.println(" bir");
                break;
            case 2:
                System.out.println(" iki");
                break;
            case 3:
                System.out.println(" üç");
                break;
            case 4:
                System.out.println(" dört");
                break;
            case 5:
                System.out.println(" beş");
                break;
            case 6:
                System.out.println(" altı");
                break;
            case 7:
                System.out.println(" yedi");
                break;
            case 8:
                System.out.println(" sekiz");
                break;
            case 9:
                System.out.println(" dokuz");
                break;
        }
    }
}
