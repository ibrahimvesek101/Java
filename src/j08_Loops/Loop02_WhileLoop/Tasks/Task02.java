package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */

        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        int sayi1 = input.nextInt();

        System.out.print("sayı giriniz : ");
        int sayi2 = input.nextInt();

        int basla = Math.min(sayi1, sayi2) + 1;

        while (basla < Math.max(sayi1, sayi2)) {


            System.out.println(basla);

            basla++;
        }
    }
}
