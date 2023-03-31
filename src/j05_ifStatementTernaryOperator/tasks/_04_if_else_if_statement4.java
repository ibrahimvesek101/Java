package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class _04_if_else_if_statement4 {

    public static void main(String[] args) {

     /* double1 ve double2 isimli iki tane double oluşturulmuştur.
        Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
        Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız. */

        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();
        double number2 = scan.nextDouble();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if (number > number2) {
            System.out.println("double 1 is greater than double 2");
        }

        if (number < number2) {
            System.out.println("double 1 is smaller than double 2");
        }


    }
}
