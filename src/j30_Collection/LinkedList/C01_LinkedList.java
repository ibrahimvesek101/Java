package j30_Collection.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C01_LinkedList {
    /*
LinkedList .....
1- LinkedList'de elemanlar "data" ve "adress" olmak uzere iki ksımdan oluşur ve eleman yerine "node" olarak tanımlanır.
2- LinkedList'te ilk node data barındırmayan sadece adres bulunduran head node tanımlanmıştır.
3- LinkedList'te son node adres kısmı null olan sadece data bulunduran tail node tanımlanmıştır.
4- ArrayList searching LinkedList node ekleme ve silmede daha avantıjlıdır.
5- LİnkedLİst -> tren vagon ilşikisi baglantısı gibi düşünülebilir
6- Collection obj tanımlanırken cons Class(LinkedList,ArrayList...) olmalı interface(List, Queue ...) olmamasına dikkat edilmeli
Ancak obj DataType olarak parent interface tanımlanabilir.
7- LinkedList class iki tane parent interface'den(List,Queue) implement etmiştir.
*/
    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("domates", "salatalık", "limon", "biber", "havuç"));

        System.out.println("ll1 = " + ll1);

        // add methodu

        ll1.add("dolma");//[domates, salatalık, limon, biber, havuç]

        System.out.println("ll1  dolma sonrası = " + ll1);// [domates, salatalık, limon, biber, havuç, dolma]

        ll1.add(1, "sucuk");

        System.out.println("ll1 1.index sucuk eklendi = " + ll1);

        ll1.addFirst("köfte");

        System.out.println("ll1 addfist sonrası = " + ll1);

        ll1.addLast("son köfteci");

        System.out.println("ll1 addLast sonrası köfteci eklenmesi = " + ll1);


        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("karpuz", "muz", "nar", "mandalina"));

        ll1.addAll(ll2);


        ll2.addAll(3, ll1);

        System.out.println("ll2 3.indexe ll1 eklendi = " + ll2);

    }
}
