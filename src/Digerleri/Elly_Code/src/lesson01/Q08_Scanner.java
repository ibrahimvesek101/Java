package Digerleri.Elly_Code.src.lesson01;

import java.util.Scanner;

public class Q08_Scanner {

    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin

    public static void main(String[] args) { //ctrl ALT L -> classi duzenler
        Scanner sc = new Scanner(System.in);
        System.out.print("lutfen birinci sayiyi giriniz :");
        int sayi1 = sc.nextInt();
        System.out.print("lutfen ikinci sayiyi giriniz :");
        int sayi2 = sc.nextInt();

        int sum = sayi1 + sayi2;
        System.out.println("sum = " + sum);
    }
}
