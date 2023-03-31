package j17_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
public class C03_PassByValue {
    public static void main(String[] args) {
             /*
        java non-primitive(Class array list-> refrans ) data turlerinde obj kendisi değil de dataları değişirse
        obj referans ve kendisi değişmediği dataları değişikliğini kalıcı yapar.
         */
        // Task -> list elemanları 24,20,87 iki farklı method ile list elemanlarını
        //      update edip print eden METHOD create ediniz.
        //1. method-> with for each 2. method-> set(index,value)

        ArrayList<Integer> sayiList = new ArrayList<>(Arrays.asList(24, 20, 87));
        System.out.println("update öncesi sayiList = " + sayiList);//[24, 20, 87]

        listUpdate1(sayiList);// [24, 20, 87]

        listUpdate2(sayiList);// [17, 13, 80]

        System.out.println("update sonrası sayiList = " + sayiList);//[17, 13, 80]

    }//main sonu

    private static void listUpdate2(ArrayList<Integer> sayiList) {
        for (int i = 0; i < sayiList.size(); i++) {
            sayiList.set(i, sayiList.get(i) -7);
        }
        System.out.println("update2 sayiList = " + sayiList);

    }

    private static void listUpdate1(ArrayList<Integer> sayiList) {

        for (Integer w:sayiList) {
            w+=10;
        }
        System.out.println("update1 sayiList = " + sayiList);
    }

}