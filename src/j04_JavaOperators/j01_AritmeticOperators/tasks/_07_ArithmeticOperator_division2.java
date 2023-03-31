package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class _07_ArithmeticOperator_division2 {

    public static void main(String[] args) {

        /* Verilen int ler hakkında, (num1, num2),
            num1'i num2'ye bölün ve sonucu int sonuc'a eşitleyin.
            int sonucu yazdırın. */

        Scanner dp = new Scanner(System.in);

        int num1 = dp.nextInt();
        int num2 = dp.nextInt();

        //Kodu aşağıya yazınız.

        int sonuc = num1 / num2;
        System.out.println(sonuc);


    }
}
