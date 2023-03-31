package j08_Loops.Loop02_WhileLoop.Tasks;

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

        int basla = 1;

        if (sayi < 100) {

            while (basla < sayi) {

                if (basla % 15 == 0) {
                    System.out.println("JavaCAN");
                } else if (basla % 5 == 0) {
                    System.out.println("CAN'dır");
                } else if (basla % 3 == 0) {
                    System.out.println("Java");
                } else System.out.println(basla);


                basla++;
            }


        } else System.out.println("lütfen 100 den küçük bir sayı giriniz.");

    }
}
