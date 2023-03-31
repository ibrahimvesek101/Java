package j29_Iterators;

import java.util.*;

public class C01_Iterators {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>(Arrays.asList("ibrahim", "neda", "vesek", "balıkesir", "ankara"));
        System.out.println("l1 list ilk hali = " + l1);

        // l1 elemanlarını foor looop ile print eden code create ediniz.
        System.out.println("   *** Task1 ***   ");

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");

        }
        // l1 elemanlarını for-each loop ile print eden code create ediniz.
        System.out.println();
        System.out.println("   *** Task2 ***   ");
        for (String w : l1) {
            System.out.print(w + " ");
        }
// Task3 l1 in her bir elemanını for-loop ile update eden code create ediniz
        System.out.println();
        System.out.println("   *** Task3 ***   ");

        for (int i = 0; i < l1.size(); i++) {
            l1.set(i, l1.get(i) + " selam");
        }
        System.out.println("l1 selam sonrası update " + l1);

        // Task4-> l1 in her bir elemanını for-each ile update eden code create ediniz..
        System.out.println("   *** Task 4 ***   ");

        for (String a : l1) {
            a += "slm";
        }
        System.out.println(l1);
        // foreach olmadı değiştirmedi.


        System.out.println("   *** Iterators ***   ");
        // Iterators için
        //step 1;
        Iterator<String> it1 = l1.iterator();   // l1 list elemanları tekrara alınması için it1 veriable tanımlandı.

        //step 2;
        while (it1.hasNext()) {
            // hasNext() -> it1 elemanları için pointer(cursor) olduğu yerin sonrasında
            // elemanlarını kontrol eder true-false return eder.

            //next() -> it1 pointer önündeki elemanı return eder.

            System.out.print(" " + it1.next());
        }
        System.out.println();
// Task5-> l1 in elemanı silip print eden code create ediniz..
        System.out.println("   *** Task 5 ***   ");
        Iterator it2 = l1.iterator();
        while (it2.hasNext()) {
            it2.next();
            it2.remove();
        }
        System.out.println("l1 eleman silme sonrası " + l1);

        List<String> l2 = new ArrayList<String>(Arrays.asList("javacan", "javatar", "başarı", "gayrete", "aşıktır"));

        // Task06 -> l2'in elemanlarını selam ile update edip  print code create ediniz..
        System.out.println("   ***   Task06   ***   ");

        System.out.println("l2 eleman -selam- update  öncesi " + l2); //

        ListIterator<String> it3 = l2.listIterator(); //step-1

        while (it3.hasNext()) {//step-2

            it3.set(it3.next() + "selam");

        }//step-3
        System.out.println("l2 eleman -selam- update  sonrası " + l2); //

        List<String> l3 = new ArrayList<String>(Arrays.asList("domates", "biber", "patlıcan", "salatalık", "limon"));

        // Task07 -> l2'in elemanlarını ilk harfi buyuk harf karakteri
        // kalan 3 harfleri *** ile update edip l3 ekleyip  print code create ediniz..

        System.out.println("   ***   Task07   ***   ");

        ListIterator<String> it4 = l2.listIterator(); //step-1

        while (it4.hasNext()) {//step-2
            it4.set(it4.next().substring(0, 1).toUpperCase() + "***");
        }
        it4.add(l3.toString());
        System.out.println("*** sonrası l2= " + l2);
    }
}