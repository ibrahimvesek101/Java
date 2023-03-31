package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class _08_ArithmeticOperator_multiply1 {

    public static void main(String[] args) {

        /* Verilen 3 double hakkında, (num1 , num2, num3),
            Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
            Sonucu yazdırın.  */

        Scanner dp = new Scanner(System.in);

        double num1 = dp.nextDouble();
        double num2 = dp.nextDouble();
        double num3 = dp.nextDouble();

        //Kodu aşağıya yazınız.

        double sonuc = num1 * num2 * num3;
        System.out.println(sonuc);


    }
}
