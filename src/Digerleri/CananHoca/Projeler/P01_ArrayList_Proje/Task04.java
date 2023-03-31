package Digerleri.CananHoca.Projeler.P01_ArrayList_Proje;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> isimListesi= new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        ArrayList<String> aOlmayanİsimler = new ArrayList<>(); // boş list

        for (int i = 0; i < isimListesi.size(); i++) {
            if (!isimListesi.get(i).toLowerCase().contains("a")) {
                // listin herhangi bir elemanı a harfini bulundurmuyorsa...
                aOlmayanİsimler.add(isimListesi.get(i));
                // ....yeni liste eklendi
            }
        }
        System.out.println("a olmayan isimler");
        System.out.println(aOlmayanİsimler);

    }
}