package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {
        /*
        j05_ifStatementTernaryOperator.ternary ile yapılan tüm aksiyonlar if-else blok ile de yapılır.
        Ternary blok code nin daha clean ve daha anlaşılabilir olması için tercih edilir.
        j05_ifStatementTernaryOperator.ternary blok içinde komplex code yerine daha basic ve doğrudan sonuç üreten code ler bulunur.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("iki sayi giriniz :");
        int sayi1= input.nextInt();
        int sayi2=input.nextInt();

        String sonuc= (sayi1<sayi2)?" sayi1 küçük":"sayi1 büyük";
        System.out.println("sonuc = " + sonuc);

    }
}
