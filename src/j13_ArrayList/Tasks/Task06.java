package j13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task06 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
         /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         print eden code create ediniz.
        */

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 7; i++) {
            System.out.print("Listin " + i + ". elemanını giriniz : ");
            int sayi = input.nextInt();
            list.add(sayi);
        }
        System.out.println("list = " + list);

        listTekElemanlar(list);

        System.out.println("listTekElemanlar(list) = " + listTekElemanlar(list));
    }

    private static ArrayList listTekElemanlar(ArrayList<Integer> list) {

        ArrayList<Integer> listTek = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                continue;
            } else {
                listTek.add(list.get(i));
            }

        }
        return listTek;
    }
}
