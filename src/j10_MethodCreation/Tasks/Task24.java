package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
/*
       task-> girilen sayıya kadar olan Fİbonacci dizisi
       elemalarını print eden METHOD create ediniz.
       Fibonacci dizisi :1, 1, 2, 3, 5, 8, 13, 21, 34
*/
        fibonacciHeaspla();

    }

    static int fib = 0;
    static int a = 1;
    static int b = 1;

    private static void fibonacciHeaspla() {

        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        int sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {

            a = b;
            b = fib;
            fib = a + b;
            System.out.print(fib + " ");
        }
    }
}
