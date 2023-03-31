package j13_ArrayList.Tasks;

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
    min = 20
    max = 30
    return =  5    (20,22,25,28,30)
    min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
     */

    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>(Arrays.asList(1,5,22,10,20,14,8,25,30,28));

        System.out.println("rangeBtw(arrayList, 20, 30) = " + rangeBtw(arrayList, 10, 20));

    }

    private static int rangeBtw(ArrayList list, int min, int max) {
        int sayac = 0;
        for (int i = 0; i < list.size(); i++) {

            if((int)list.get(i)>=min &&(int)list.get(i)<=max){
                sayac++;
                System.out.print(list.get(i)+" ");
            }
        }
        return sayac;
    }
}