package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task09 {


    /*Task->
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen inek sayısını giriniz : ");
        int inekSayisi = scan.nextInt();

        System.out.println("Lütfen koyun sayısını giriniz : ");
        int koyunSayisi = scan.nextInt();

        System.out.println("Lütfen tavuk sayısını giriniz : ");
        int tavukSayisi = scan.nextInt();

        int toplamAyak = inekSayisi * 4 + koyunSayisi*4 + tavukSayisi * 2;

        System.out.println("Toplam Ayak : " + toplamAyak);

    }

}
