package j29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_Previous {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(34, 35, 41, 58, 31, 7, 38, 61, 9));
        System.out.println("l1 in ilk hali = " + l1);

        //Task01-> l1 elemanlarını sondan başa doğru print eden code create ediniz.
        System.out.println("   *** Task01 ***   ");
        ListIterator<Integer> it1 = l1.listIterator();//step-1
        while (it1.hasNext()) {//bastan sona doğru pointer i ilerletir.
            it1.next();
        }
        while (it1.hasPrevious()) {  //ana aksiyon için pointer sondan başa doğru adım adım getirdik.
            System.out.print(it1.previous() + " ");
        }
        System.out.println();


//      Task01-> l2 elemanın sonuncusuna :-) update edip print eden codee create ediniz.

        List<String> l2 = new ArrayList<String>(Arrays.asList("elma", "armut", "portakal", "mandalina", "nar"));

        System.out.println("   ***   task02   ***   ");

        ListIterator<String> it2 = l2.listIterator();   //step-1

        while (it2.hasNext()) {//bastan sona doğru pointer i ilerletir.
            it2.next();

            if(it2.hasNext()==false){   //pointer en sonda
                it2.previous();         //pointer son elemanı verir
                it2.set(it2.next()+" : ) ");
           }
        }
        System.out.println("l2 set sonrası" + l2);
    }
}
