package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

    /*    Verilen iki tane int  (num1 , num2),
        Bu iki Integer'in toplamını yazdırın. */

        Scanner dp = new Scanner(System.in);
        int num1 = dp.nextInt();
        int num2 = dp.nextInt();

        //Kodu aşağıya yazınız.
        int toplam = num1 + num2;
        System.out.println(toplam);

    }
}
