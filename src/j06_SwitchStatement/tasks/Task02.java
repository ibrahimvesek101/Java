package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Task-> Girilen güne  göre 100 gün sonraki hangi günü print eden code create ediniz.
        //  hafta başlangıcı:pazartesi alınız

        Scanner input = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\nHaftanın kaçıncı gününde olduğununuzu giriniz : ");

        int gun = input.nextInt();

        switch (gun) {
            case 1:
                System.out.println("100 gün sonra = çarşamba");
                break;
            case 2:
                System.out.println("100 gün sonra = perşembe");
                break;
            case 3:
                System.out.println("100 gün sonra = cuma");
                break;
            case 4:
                System.out.println("100 gün sonra = cumartesi");
                break;
            case 5:
                System.out.println("100 gün sonra = pazar");
                break;
            case 6:
                System.out.println("100 gün sonra = pazartesi");
                break;
            case 7:
                System.out.println("100 gün sonra = salı");
                break;

        }
    }
}

