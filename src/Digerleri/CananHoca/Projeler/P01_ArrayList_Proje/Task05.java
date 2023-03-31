package Digerleri.CananHoca.Projeler.P01_ArrayList_Proje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Task05 {
    public static void main(String[] args) {


         /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki
        tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */
        String isimArr[][] =
                {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};

        yeniList(isimArr);
        System.out.println(yeniList(isimArr));

    }

    private static List<String> yeniList(String[][] isimArr) {
        List<String> isimList = new ArrayList<>();
        //{{"Ali", "Veli", "Ayse"}
        // {"Hasan", "Can"},
        // {"Suzan"}};

        for (int i = 0; i < isimArr.length; i++) {
            for (int j = 0; j < isimArr[i].length; j++) {
                isimList.add(isimArr[i][j]);
            }

            //{"Ali", "Veli", "Ayse", "Hasan", "Can", "Suzan"};

            Collections.sort(isimList); // alfabetik sıralar
            // [Ali, Ayse, Can, Hasan, Suzan, Veli]

        }
        return isimList;

    }
}