package Digerleri.CananHoca.ArrayListCozum;

import java.util.ArrayList;
import java.util.Arrays;

public class _10_arraylist12 {
        /*
        rangeBtw() isminde bir method oluşturun.
        Parametre olarak   bir Arraylist  ve iki ayrı int
        return tipi int

        Arraylist'in iki int arasında kaç değeri olduğunu sayın.
        return  count       (sayacı (count) döndürün.)

        Example (Örnek):
        ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
        sıralanmış hali: 1, 5, 8, 10, 20,22,25,28,30
        min = 20
        max = 30
        return =  5    (20,22,25,28,30)
        min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
         */

    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>(Arrays.asList(1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28));
        int min = 20;
        int max = 30;

        rangeBtw(arrayList,max,min);
        System.out.println(rangeBtw(arrayList,max,min));
    }

    private static int rangeBtw(ArrayList<Integer> arrayList, int max, int min) {
        int sayac=0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)>=min && arrayList.get(i)<=max) {
                sayac++;
            }
        }
        return sayac;

    }}
