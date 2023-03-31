package Digerleri.CananHoca.ArrayListCozum;

import java.util.ArrayList;
import java.util.Arrays;

public class Task16 {

        /*
          Task:

        Create 2D ArrayList which can store String ArrayLists
        Create 3 ArrayLists which are Employees, Employers, Companies
        Store this 3 ArrayList in 2D ArrayList
        String ArrayList'leri depolayabilen 2D ArrayList oluşturun
        Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
        Bu 3 ArrayList'i 2D ArrayList'te saklayın
        output: //[[Ahmet, Ali, Emrah, Elif, tecnical support],
         [Haluk, Eylul, Yusuf, Can, İbrahim, Mehmet],
         [Amazon, Google, Testinium, IBM]]

         1. adım: iki boyutlu boş bir arraylist oluştur
         2. adım: Çalışanlar, İşverenler, Şirketler isimli tek boyutlu arraylistler oluştur
         3. adım: tek boyutlu listeleri iki boyutlu listeye ekle
         */

    public static void main(String[] args) {
        //1. adım
        ArrayList<ArrayList<String>> listeler = new ArrayList<>();

        //2. adım
        ArrayList<String> calisanlar = new ArrayList<>
                (Arrays.asList("Ahmet","Ali","Emrah"));

        ArrayList<String> isverenler =
                new ArrayList<>(Arrays.asList("Haluk","eylül","yusuf"));

        ArrayList<String> sirketler =
                new ArrayList<>(Arrays.asList("google","amazon","IBM"));

        //3. adım
        listeler.add(calisanlar);
        listeler.add(isverenler);
        listeler.add(sirketler);
        System.out.println(listeler);

    }
}