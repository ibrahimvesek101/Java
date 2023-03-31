package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/* Task->
		 Girilen bir sayı için
		 sayi 3 basamakli ise console ' a "3 basamakli"
		 sayi 2 basamakli ise console'a "2 basamakli"
		 sayi 3 basamakli yada 2 basamakli degilse "ikisi de degil"  print eden code create ediniz
		 */
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz : ");

        String sayi = input.nextLine();
        int sayiBasamak = sayi.length();

        if (sayiBasamak == 3) {
            System.out.println("\"3 basamaklı\"");
        } else if (sayiBasamak == 2) {
            System.out.println("\"2 basamaklı\"");
        } else
            System.out.println("\"ikisi de değil\"");

    }
}
