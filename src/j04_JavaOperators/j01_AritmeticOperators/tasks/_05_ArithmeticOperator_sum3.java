package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class _05_ArithmeticOperator_sum3 {

    public static void main(String[] args) {

        /* Verilen 3 tane int (num1,num2,num3),
           Bu üç int'in toplamı yazdırın.   */

        Scanner dp = new Scanner(System.in);

        int num1 = dp.nextInt();
        int num2 = dp.nextInt();
        int num3 = dp.nextInt();


        //Kodu aşağıya yazınız.

        int toplam = num1 + num2 + num3;
        System.out.println(toplam);


    }
}
