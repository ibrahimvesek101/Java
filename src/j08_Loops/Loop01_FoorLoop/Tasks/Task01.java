package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari
       		- Sayi 3’un kati ise sayi yerine “Java”
       		- Sayi 5’in kati ise sayi yerine “CAN'dır”
       		- Sayi hem 3’un hem 5’in kati ise sayi yerine “JavaCAN” print eden code create ediniz

*/
        Scanner input = new Scanner(System.in);

        System.out.print("sayı giriniz : ");

        int sayi = input.nextInt();

        if (sayi > 0 && sayi < 100) {

            for (int i = 1; i <= sayi; i++) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("JavaCAN ");
                } else if (i % 5 == 0) {
                    System.out.print("CAN'dır ");
                } else if (i % 3 == 0) {
                    System.out.print("Java ");
                }else System.out.print(i +" ");
            }
        } else System.out.println("lütfen 0 ile 100 arasında bir sayı giriniz.");
    }
}
