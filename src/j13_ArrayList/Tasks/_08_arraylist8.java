package j13_ArrayList.Tasks;

import java.util.*;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>(Arrays.asList(5,8,10,3,4,6,7));
        System.out.println("secondMax(arrayList) = " + secondMax(arrayList));

    }

    private static int secondMax(ArrayList list) {
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {

        }
        return (int) list.get(list.size() - 2);
    }
}
