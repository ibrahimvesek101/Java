package j26_Exceptions;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        /*
Task -> Girilen password'un 6 karakterden az 10 karakterden fazla olmamasını
 kontrol eden code create ediniz
 */

        Scanner input = new Scanner(System.in);
        System.out.println("password giriniz : ");
        String password = input.nextLine();

        try {
            if (password.length() < 6 || password.length() > 10) {
                throw new IllegalArgumentException("password 6 karakterden az 10 karakterden fazla olmaz.");

            } else {
                System.out.println("password başarılı");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("password tekrar giriniz : ");
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }
}
