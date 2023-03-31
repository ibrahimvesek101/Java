package j13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        // Task->  verilen bir listede tekrar eden sayilari sadece 1 kez print eden METHOD create ediniz.
        // input : [1, 3, 5, 3, 5, 6, 1, 7]
        // output [1, 3, 5, 6, 7]
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 3, 5, 6, 1, 7));

        tekrarsizlistPrintEt(list);
    }

    private static void tekrarsizlistPrintEt(ArrayList<Integer> list) {
        ArrayList<Integer> benzersizList = new ArrayList<>();    //boş list tanımlandı.

        for (int i = 0; i < list.size(); i++) {
            if (!benzersizList.contains(list.get(i))) {
                benzersizList.add(list.get(i));
            }
        }
        System.out.println(benzersizList);
    }
}
