package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class _02_ArithmeticOperator_sum2 {

    public static void main(String[] args) {

     /*   Verilen 4 tane int vardır.
        Int'lerin toplamlarını yazdırın  */
        Scanner dp = new Scanner(System.in);
        int num1 = dp.nextInt();
        int num2 = dp.nextInt();
        int num3 = dp.nextInt();
        int num4 = dp.nextInt();

        //Kodu aşağıya yazınız.
        int toplam = num1 + num2 + num3 + num4;
        System.out.println(toplam);


    }
}
