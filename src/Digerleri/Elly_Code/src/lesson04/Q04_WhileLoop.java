package Digerleri.Elly_Code.src.lesson04;

import java.util.Scanner;

public class Q04_WhileLoop {

    /*
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
    girilen sayı dahil(tek ise), tek olanlarin adet yazdiralim
   */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sayi giriniz : ");
        int sayi = sc.nextInt();

        int counter = 0; //sayac

        while(sayi>0){
            if(sayi%2 ==1){
                System.out.print(sayi + " ");
                counter++; //tek olanları saydik

            }
            sayi--; //butun sayilaera bakacagi icin yazdik
        }

        System.out.println();
        System.out.println("counter = " + counter);
    }

}
