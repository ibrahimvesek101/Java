package Digerleri.interview.src.Day04;

import java.util.Scanner;

public class Q10_OddIndexNumber {
    // indexi tek sayi olan karakterleri yazdiran bir code create ediniz

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir metin giriniz :");
        String str = scanner.nextLine();
        for (int i = 1; i <str.length() ; i+=2) {
            System.out.print(str.substring(i,i+1)+" ");
        }

    }

}
