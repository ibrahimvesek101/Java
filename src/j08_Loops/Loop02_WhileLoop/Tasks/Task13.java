package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde
        "javaTAR" print eden code create ediniz.
        do-while lopp
         */

        Scanner input = new Scanner(System.in);
        String metin = "";


        do {
            System.out.println("javaCan");
            System.out.print("metin giriniz : ");
            metin = input.nextLine();

        } while (!metin.equalsIgnoreCase("x"));

        System.out.println("javaTar");
    }
}
