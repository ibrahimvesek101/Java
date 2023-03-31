package j13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println("getSum(list1) = " + getSum(list1));

    }

    private static int getSum(ArrayList<Integer> list) {
    int toplam=0;
        for (int i = 0; i < list.size(); i++) {
           toplam += list.get(i);
        }

        return toplam;
    }
}
