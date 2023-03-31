package j13_ArrayList.Tasks;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class Task09 {

    public static void main(String[] args) {
        /* TASK :
Bir integer list oluşturunuz ve bu list'deki tum sayıların karesinin
toplamını bulan code create ediniz.
 */
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        String listSayilari = "";
        int toplam = 0;

        System.out.println("liste atamak için sayı giriniz \ntamam yeter dediğinizde 'q' giriniz.");

        while (!listSayilari.equalsIgnoreCase("q")) {
            System.out.print("sayı giriniz : ");
            listSayilari = input.nextLine();
            list.add(listSayilari);
        }

        list.remove(list.size() - 1);   //listteki  son eleman "q" silinmeli işlem yapacağız.

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
           toplam +=Integer.parseInt( list.get(i))*Integer.parseInt( list.get(i));

        }
        System.out.println("Girdiğiniz sayıların kareleri toplamı = "+ toplam);
    }
}
