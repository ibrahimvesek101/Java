package Digerleri.Elly_Code.src.weeklyTasks;

import java.util.Scanner;

public class _01TaskScanner {

    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen inek sayisini giriniz : ");
        int inekSayisi = scan.nextInt();

        System.out.println("Lutfen koyun sayisini giriniz : ");
        int koyunSayisi = scan.nextInt();

        System.out.println("Lutfen tavuk sayisini giriniz : ");
        int tavukSayisi = scan.nextInt();

        int toplamAyak = inekSayisi * 4 + koyunSayisi*4 + tavukSayisi * 2;

        System.out.println("Toplam Ayak : " + toplamAyak);

    }
}
