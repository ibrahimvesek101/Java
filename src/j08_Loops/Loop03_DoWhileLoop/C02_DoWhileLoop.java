package j08_Loops.Loop03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        // task-> girilen 13 den kucuk ise "olaaa kazandınız :) " değilse saysı girişi isteyen code create ediniz...

        Scanner input = new Scanner(System.in);
        int sayi =0;
        do {

            System.out.print("Agam sayi giresen : ");
            sayi = input.nextInt();//sayi variable kullanıcıdan değeri atandı

        }while (sayi >=13);
        System.out.println(sayi+" için olaaa kazandınız :) ");

    }
}