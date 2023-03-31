package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class _04_ArithmeticOperator_subtract2 {

    public static void main(String[] args) {

        /*
        Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
        Sonucu yazdırın.
        Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.
         */

        Scanner dp = new Scanner(System.in);

        int num1 = dp.nextInt();
        int num2 = dp.nextInt();
        int num3 = dp.nextInt();
        int num4 = dp.nextInt();

        //Kodu aşağıya yazınız.

        int fark = num1 - num2 - num3 - num4;
        System.out.println(fark);
    }
}
