package j05_ifStatementTernaryOperator;

import java.io.StringBufferInputStream;
import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("iki sayi giriniz :");
        int sayi1= input.nextInt();

      String durum= (sayi1>9||sayi1<-9)?"iki basamaklı":"iki basamaklı değil";
        System.out.println(durum);
    }
}
