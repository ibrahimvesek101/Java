package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task->  Girilen bir tamsayının onlar basamağının harf karakterini  print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen iki basamaklı bir sayi giriniz = ");
        int sayi = input.nextInt();

        int onlar = sayi / 10;

        switch (onlar) {
            case 0:
                System.out.println("onlar basamağı = sıfır");
                break;
            case 1:
                System.out.println("onlar basamağı = bir");
                break;

            case 2:
                System.out.println("onlar basamağı = iki");
                break;

            case 3:
                System.out.println("onlar basamağı = üç");
                break;

            case 4:
                System.out.println("onlar basamağı = dört");
                break;

            case 5:
                System.out.println("onlar basamağı = beş");
                break;

            case 6:
                System.out.println("onlar basamağı = altı");
                break;

            case 7:
                System.out.println("onlar basamağı = yedi");
                break;

            case 8:
                System.out.println("onlar basamağı = sekiz");
                break;

            case 9:
                System.out.println("onlar basamağı = dokuz");
                break;
            default:
                System.out.println();
        }


    }


}

