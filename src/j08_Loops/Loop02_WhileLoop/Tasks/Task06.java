package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        /*
        1 ile 100    sayi arasındaki  pc'nin atadığı tamsayıyı kullanıcıya
        tahmin ettirip tahmin sayısını print eden  code create ediniz.
         */


        Scanner input = new Scanner(System.in);

        int sayi;
        int rasgeleSayi;

        do {
            System.out.print("Bir sayı tahmin ediniz : ");
            sayi = input.nextInt();

            Random rnd = new Random();

            rasgeleSayi = rnd.nextInt(10);      //Not: 1-100 arası çok fazla ben 1-10 arası yaptım.

            System.out.println(rasgeleSayi);

        } while (!(sayi == rasgeleSayi));

        System.out.println("Tebrikler sayıyı tutturdunuz !!!");
    }

}
