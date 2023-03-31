package j13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task09bucuk {
    public static void main(String[] args) {
  /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("liste atamak içn sayı giriniz\nAgam yeter diyirsen 0 gir ");

        int listSayılari =99999;

        double toplam = 0;//list karelerini toplamı için boş kutu

        while (listSayılari!=0) {//while döngü girilen sayı 0 değilse action alır
            System.out.println(" Agam sayı giresen : ");
            listSayılari=input.nextInt();//lisSayilar 0 olan başlangıc değeri yerine inputtan gelen değer atandı
            list.add(listSayılari);//listsayılar liste eklendi
        }
        System.out.println("agam girdiğin sayı listi : " + list);

        for (int i = 0; i < list.size(); i++) {
            toplam +=list.get(i) * list.get(i);
        }
        System.out.println("agam giridigin dsayılar toplamı : " +( toplam));
    }
}