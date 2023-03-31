package Digerleri.Elly_Code.src.lesson04;

import java.util.Scanner;

public class Q03_Forloop {
    // 1 x 1 = 1
    // 1 x 2 = 2
    // 1 x 3 = 3
    // 1 x 4 = 4
    // 1 x 5 = 5
    // 1 x 6 = 6
    // 1 x 7 = 7
    // 1 x 8 = 8
    // 1 x 9 = 9
    // 1 x 10 = 10
    // Yukarıdaki çarpım tablosunu 10 a kadar ekrana yazdırınız.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kaca kadar carpim tablosu : ");
        int n = sc.nextInt();
        carpimTablosu (n);
    }

    private static void carpimTablosu(int n) {
        for (int i = 1; i <=n; i++) { //outer for loop
            for (int j = 1; j <=10; j++) { //inner loop
                System.out.println(i + " x " + j + " = " + (i*j));
            }

            System.out.println();
        }
    }
}

