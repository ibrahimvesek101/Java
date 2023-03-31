package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class tek_cift {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("bir sayı giriniz");

        int sayi = input.nextInt();

        String sonuc = (sayi % 2 == 0) ? "çift sayı" : "sayı tek sayı";
        System.out.println(sonuc);

    }
}
