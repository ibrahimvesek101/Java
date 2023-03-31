package Digerleri.interview.src.Day03;

import java.util.ArrayList;

public class Q02_CreateRandomList_SetList {
    // int array list oluşturun 10 elemandan oluşmalı
    // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
    // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
    // eğer çift sayı atarsa o elemanının yerine 111 yazsın
    // eğer çift sayı yoksa çift sayı yoktur mesajını versin.
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        rondomEkle(list);
        list = new ArrayList<>();
        System.out.println(list);
        rondomEkle2(list);
        list = new ArrayList<>();
        list=rondomEkle3(list);
        System.out.println(list);
    }

    private static void rondomEkle(ArrayList<Integer> liste) {
        boolean ciftSayi=false;
        for (int i = 0; i <10 ; i++) {
            int rondomSayi=(int) (Math.random()*21);
            if (rondomSayi%2==0) {
                liste.add(111);ciftSayi=true;
            } else {
                liste.add(rondomSayi);
            }
        }
        System.out.println(liste);
        if (!ciftSayi) System.out.println("Cift Sayi yoktur");
    }
    private static void rondomEkle2(ArrayList<Integer> liste) {
        // yontem 2
        for (int i = 0; i <10 ; i++) {
            int rondomSayi=(int) (Math.random()*21);
            if (rondomSayi%2==0) {
                liste.add(111);
            } else {
                liste.add(rondomSayi);
            }
        }
        System.out.println(liste);
        if (!liste.contains(111)) System.out.println("Cift Sayi yoktur");
    }
    private static ArrayList<Integer> rondomEkle3(ArrayList<Integer> liste) {
        // yontem 2
        for (int i = 0; i <10 ; i++) {
            int rondomSayi=(int) (Math.random()*21);
            if (rondomSayi%2==0) {
                liste.add(111);
            } else {
                liste.add(rondomSayi);
            }
        }

        if (!liste.contains(111)) System.out.println("Cift Sayi yoktur");
        return liste;
    }


}
