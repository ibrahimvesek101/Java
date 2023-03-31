package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class _10_Arithmetic_Operator_multiply3 {

    public static void main(String[] args) {

        /* Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        Bu int'leri birbiriyle çarpın ve sonuca eşitleyin.
        int sonuc u yazdırın. */

        Scanner dp = new Scanner(System.in);

        int num1 = dp.nextInt();
        int num2 = dp.nextInt();
        int num3 = dp.nextInt();
        int num4 = dp.nextInt();
        //Kodu aşağıya yazınız.

        int sonuc = num1 * num2 * num3 * num4;
        System.out.println(sonuc);


    }
}
