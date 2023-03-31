package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class _06_ArithmeticOperator_division1 {

    public static void main(String[] args) {

        /* Verilen iki int hakkında (num1,  num2),
        İlk int'i ikinci int'e bölün.
        Sonucu yazdırın. */

        Scanner dp = new Scanner(System.in);

        int num1 = dp.nextInt();
        int num2 = dp.nextInt();


        //Kodu aşağıya yazınız.

        int bolum = num1 / num2;
        System.out.println(bolum);
    }
}
