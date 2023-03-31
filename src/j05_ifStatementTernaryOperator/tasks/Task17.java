package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        /*
        Task-> taş- kağıt -makas oyununu simüle eden code create ediniz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1.oyuncu olarak 'taş' 'makas' veya 'kağıt' giriniz : ");
        String oyuncu1 = input.nextLine();
        System.out.println("Lütfen 2.oyuncu olarak 'taş' 'makas' veya 'kağıt' giriniz : ");
        String oyuncu2 = input.nextLine();

        if (oyuncu1.equals("taş") && oyuncu2.equals("makas")) {
            System.out.println("TEBRİKLER! 1.oyuncu kazandı");

        } else if (oyuncu1.equals("taş") && oyuncu2.equals("kağıt")) {
            System.out.println("TEBRİKLER! 2.oyuncu kazandı");

        } else if (oyuncu1.equals("taş") && oyuncu2.equals("taş")) {
            System.out.println("BERABER !");

        } else if (oyuncu1.equals("makas") && oyuncu2.equals("taş")) {
            System.out.println("TEBRİKLER! 2.oyuncu kazandı");

        } else if (oyuncu1.equals("makas") && oyuncu2.equals("kağıt")) {
            System.out.println("TEBRİKLER! 1.oyuncu kazandı");

        } else if (oyuncu1.equals("makas") && oyuncu2.equals("makas")) {
            System.out.println("BERABER !");

        } else if (oyuncu1.equals("kağıt") && oyuncu2.equals("taş")) {
            System.out.println("TEBRİKLER! 1.oyuncu kazandı");

        } else if (oyuncu1.equals("kağıt") && oyuncu2.equals("makas")) {
            System.out.println("TEBRİKLER! 2.oyuncu kazandı");

        } else if (oyuncu1.equals("kağıt") && oyuncu2.equals("kağıt")) {
            System.out.println("BERABER !");

        } else {
            System.out.println("lütfen girdiğiniz değerleri kontrolederek tekrar oynayınız.");
        }


    }
}
