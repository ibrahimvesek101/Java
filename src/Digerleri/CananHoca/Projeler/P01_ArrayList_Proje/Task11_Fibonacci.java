package Digerleri.CananHoca.Projeler.P01_ArrayList_Proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11_Fibonacci {
    /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    sayi=34

    1-1-2-3-5-8-13-21-34....


    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi= scan.nextInt();

        List<Integer> fibonacci= new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(1);
        // 1-1-2-3-5-8-13-21-34....

        int i= 2;
        int yeniSayi=0;

        while (yeniSayi<sayi) {
            // (i-2)+(i-1)
            yeniSayi= fibonacci.get(i-2) + fibonacci.get(i-1);
            fibonacci.add(yeniSayi);
            i++;
        }
        System.out.println(fibonacci);

    }
}