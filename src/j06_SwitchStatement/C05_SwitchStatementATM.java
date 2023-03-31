package j06_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchStatementATM {

    public static void main(String[] args) {

        // TaskATM> Bakiye 1000 $ olan bir....

        System.out.println("Bakiye Öğrenmek için -> 1 \nPara Çekmek için -> 2 \n" +
                "Para Yatırmak için -> 3\nÇıkış için -> 4 e basınız ");

        Scanner input = new Scanner(System.in);
        int tercih = input.nextInt();
        int bakiye = 1000;


        switch (tercih) {
            case 1:
                System.out.println("Bakiyeniz = " + bakiye + " $");
                break;
            case 2:
                System.out.println("Lütfen çekmek istediğiniz miktarı giriniz");
                int cekilen = input.nextInt();

                if (bakiye >= cekilen) {
                    System.out.println("Para çekim işlemi başarılı.\n" +
                            "Çekilen miktar = " + cekilen + " $" + "\n" +
                            "Güncel bakiyeniz = " + (bakiye - cekilen) + " $");
                } else System.out.println("Bakiyeniz yetersiz!");
                break;
            case 3:
                System.out.println("Lütfen yatırmak istediğiniz miktarı giriniz");
                int yatirilan = input.nextInt();
                System.out.println("Para yatırma işlemi başarılı.\n" +
                        "Yatırılan miktar = " + yatirilan + " $" + "\n" +
                        "Güncel bakiyeniz = " + (bakiye + yatirilan) + " $");
                break;
            case 4:
                System.out.println("Çıkış işlemi başarılı yine bekleriz :) ");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız");

        }
    }
}



