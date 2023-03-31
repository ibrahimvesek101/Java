package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class _09_ArithmeticOperator_multiply2 {

    public static void main(String[] args) {

    /*    Oluşturulmuş olan double'lar hakkında,
        Bu 4 doubleyi  birbiriyle çarpın ve sonuca  eşitleyin.
        Double sonucu yazdırın.   */

        Scanner dp = new Scanner(System.in);

        double num1 = dp.nextDouble();
        double num2 = dp.nextDouble();
        double num3 = dp.nextDouble();
        double num4 = dp.nextDouble();

        //Kodu aşağıya yazınız.

        double sonuc = num1 * num2 * num3 * num4;
        System.out.println(sonuc);

    }
}
