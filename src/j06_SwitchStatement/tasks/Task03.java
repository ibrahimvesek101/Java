package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        // Task-> Girilen hafta gün sayısına karşılık gelen gün adını print eden code create ediniz.
        // 1.gün Pazartesi olsun

        Scanner input = new Scanner(System.in);

        System.out.print("Pazartesi -> 1\nSalı -> 2\nÇarşamba -> 3" +
                "\nPerşembe ->4\nCuma -> 5\nCumartesi -> 6\nPazar -> 7\nLütfen bir sayı giriniz :");
        int gun = input.nextInt();

        switch (gun){

            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;









        }

    }
}
