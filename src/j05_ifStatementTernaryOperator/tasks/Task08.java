package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan password girmesini isteyin.
Girdiği password 5’e bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		 */


        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen password giriniz : ");
        int password = scan.nextInt();


        if (password % 10 == 0) {
            System.out.println("5'e bölünen çif sayı");
        } else {
            if (password % 5 == 0) {
                System.out.println("5' e bölünen tek sayı");
            } else {
                System.out.println("Tekrar deneyin");
            }
        }
    }
}
