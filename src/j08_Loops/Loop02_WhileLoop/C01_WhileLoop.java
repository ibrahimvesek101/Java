package j08_Loops.Loop02_WhileLoop;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
import java.util.WeakHashMap;

public class C01_WhileLoop {
    public static void main(String[] args) {


        //      int a=3;
        //      while (a<=20){
        //          System.out.print(a+ " ");
        //          a++;
        //      }


        //       // Task ->  7 kere Java can yazdırınız
//
        //       int a=1;
        //       while (a<=7){
        //           System.out.print("JavaCan ");
        //           a++;
        //       }
//
        //       //3.task
        //
        //
        //       Scanner input = new Scanner(System.in);
//
        //       System.out.print("sayı giriniz : ");
//
        //       int sayi = input.nextInt();


// 2 basamaklı tek sayılar;

        //      int basla = 11;

        //      while (basla <= 99) {
        //          System.out.print(basla + " ");
        //          basla += 2;

        //      }

        // task4 ->bir basamaklı sayma sayılarını print eden code print ediniz


//      int bas=1;
//      while (bas<=9){

//      System.out.print(bas+ " ");
//      bas++;
//  }

        //task5 -> metni tersten prin ediniz;


//        Scanner input = new Scanner(System.in);
//
//        System.out.print("metin giriniz : ");
//
//        String kelime = input.nextLine();
//
//        int kelimeUzun = kelime.length();
//        while (kelimeUzun >= 1) {
//
//            System.out.print(kelime.charAt(kelimeUzun - 1));
//
//            kelimeUzun--;
//        }

//task6 -> girilen sayıya kadar sayıların toplamını print;


        //      Scanner input = new Scanner(System.in);

        //      System.out.print("sayı giriniz : ");

        //      int sayi = input.nextInt();

        //      int toplam=0;

        //      while (0<=sayi){

        //      toplam+=sayi;

        //      sayi--;

        //      }System.out.println(toplam);


        //task7-> girilen sayının faktöriyelini hesaplayınız:


        Scanner input = new Scanner(System.in);

        System.out.print("sayı giriniz : ");

        int sayi = input.nextInt();

        int faktoriyel = 1;

        while (0 < sayi) {

            faktoriyel *= sayi;

            sayi--;

        }
        System.out.println(faktoriyel);


    }
}
