package j30_Collection.Set;

import java.util.*;

public class Task02 {
    public static void main(String[] args) {

    //  interview question : girilen String datanın karakterlerini
        //  alfabetik print ediniz-> TreeSet'e atanır ...
    //  hashSet ve treeSet tanımlayıp run surelerini karsılastırınız..
    //  Trick run suresi için System.currrentTimeMillis() meth. call ediniz...

        long hsBaslsa=System.currentTimeMillis();   // hashSet başlama zamanı atandı.

        HashSet<String> hs = new HashSet<>();
        hs.add("ibrahim");
        hs.add("neda");
        hs.add("vesek");
        hs.add("balıkesir");
        hs.add("turkiye");
        hs.add("ankara");
        hs.add("istanbul");


        long hsBitir=System.currentTimeMillis();   // hashSet başlama zamanı atandı.

        System.out.println("hashSet run Süresi "+ (hsBitir-hsBaslsa));

        System.out.println("   ***   ");

        long tsBaslsa=System.currentTimeMillis();   // hashSet bitirme zamanı atandı.

        TreeSet<String> ts =new TreeSet<>();

        ts.add("ibrahim");
        ts.add("neda");
        ts.add("vesek");
        ts.add("balıkesir");
        ts.add("turkiye");
        ts.add("ankara");
        ts.add("istanbul");

        long tsBitir=System.currentTimeMillis();   // hashSet bitirme zamanı atandı.
        System.out.println("TreeSet run Süresi " + (tsBitir-tsBaslsa));


    }
}
