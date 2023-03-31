package j13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _05_arraylist5 {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("İstanbul", "Balıkesir", "Ankara", "Bursa"));

        System.out.println("rotateList(arrayList) = " + rotateList(arrayList));

    }

    private static ArrayList rotateList(ArrayList list) {
        ArrayList<String> tersList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            tersList.add((String) list.get(i));
        }
        return tersList;
    }
}

