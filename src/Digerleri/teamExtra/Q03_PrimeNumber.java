package Digerleri.teamExtra;
import java.util.Scanner;

public class Q03_PrimeNumber {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

         /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */

        int input;
        boolean asalMi= true;

        do {
            System.out.println("Lütfen pozitif bir sayı giriniz");
            input = scan.nextInt();
        }while (input < 2 );

        for (int i = 2 ; i <input ; i++) {
            if (input%i == 0) {
                asalMi=false;
                break;
            }
        }
        if (asalMi){
            System.out.println( input + " asaldır");
        } else {
            System.out.println( input + " asal değildir");
        }
    }
}