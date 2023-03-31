package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        /*
          TASK -> girilen bir karakterin harf  olup olmadığını  kontrol eden code create ediniz..

         */

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir harf giriniz : ");

        char ch = input.nextLine().charAt(0);

        if (Character.isAlphabetic(ch)) {
            System.out.println("girilen bir harftir");

    }else {
            System.out.println("Girilen harf değil");}
    }
}
