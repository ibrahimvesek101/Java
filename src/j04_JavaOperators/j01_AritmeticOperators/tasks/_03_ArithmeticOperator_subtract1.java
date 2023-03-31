package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class _03_ArithmeticOperator_subtract1 {

    public static void main(String[] args) {

    /*    Verilen 2 tane int (num1, num2),
        Int'lerin farkını yazdırın. */

        Scanner dp = new Scanner(System.in);

        int num1 = dp.nextInt();
        int num2 = dp.nextInt();

        //Kodu aşağıya yazınız.

        int fark = num1 - num2;
        System.out.println(fark);


    }
}
