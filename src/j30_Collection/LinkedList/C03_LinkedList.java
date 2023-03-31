package j30_Collection.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("domates", "salatalık", "limon", "biber", "havuç"));
        System.out.println("ll1 ilk hali= " + ll1);

        // LinkedList remove ->

        System.out.println("ll1.remove() = " + ll1.remove());

        System.out.println("ll1.remove = " + ll1); //

        System.out.println("ll1.remove(\"salatalık\") = " + ll1.remove("salatalık"));
        System.out.println("ll1.remove(\"salatalik\") = " + ll1.remove("salatalik"));


        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("karpuz", "muz", "nar", "mandalina"));

        ll1.addAll(ll2);

        System.out.println("ll1 e ll2 eklenmiş hali = " + ll1);

        ll1.removeAll(ll2);
        System.out.println("ll1 den ll2 nn silinmiş hali = " + ll1);


        System.out.println("ll2.element() = " + ll2.element());


        //LinkedList get() - getFirst() - getLast()

        System.out.println("ll2.get(3) = " + ll2.get(3));
        System.out.println("ll2.getFirst() = " + ll2.getFirst());
        System.out.println("ll2.getLast() = " + ll2.getLast());

        LinkedList<Integer> sayıList = new LinkedList<>(Arrays.asList(1, 3, 4, 6, 7, 45, 59, 38));
        System.out.println("sayıList= " + sayıList);

        System.out.println("sayıList.remove(3) = " + sayıList.remove(3));


        //  remove method parametre integer alırsa List data Type integer olduğunda
        //  method parametre obj değil index tanımlar.

    }
}
