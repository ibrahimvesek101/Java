package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class HarfmiDegilmi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir harf giriniz : ");

        char ch = input.nextLine().charAt(0);

        if (Character.isAlphabetic(ch)) {
            System.out.println("girilen bir harftir");

        }else {
            System.out.println("Girilen harf değil");}

        System.out.println("2. yöntem:");

        System.out.println((Character.isAlphabetic(ch) ? "harftir." : "harf değildir."));


    }
}
