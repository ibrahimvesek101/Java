package j13_ArrayList.Tasks;

import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.ArrayList;


public class _12_array1 {

    /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
    
    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,6,7, 2,5, 5,3));

        System.out.println("dupicate(list) = " + dupicate(list));
    }

    private static boolean dupicate(ArrayList list) {
        Collections.sort(list);
boolean durum = false;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i)==list.get(i+1)){
            durum = true;
            }
        }
        return durum;
    }
}