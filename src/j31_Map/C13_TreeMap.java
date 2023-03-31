package j31_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class C13_TreeMap {
    public static void main(String[] args) {

        /*
TreeMap->
1-TreeMap key'lerde null değer tanımlanamaz.Fakat value'larda null değer tanımlanabilir.
2-TreeMap elemanlarının key NATUREL ORDER'a göre tanımlar.
3-TreeMap synchronized ve thread-safe değildir
4-TreeMap en yavaş map turudur.app hızı için kullanırken çooook dikkat edilmeli...
 */


        TreeMap<Integer,String> tm=new TreeMap<>(); //  boş bir tm tanımlandı

        tm.put(101,"ibrahim");
        tm.put(102,"neda");
        tm.put(103,"vesek");
        tm.put(101,"ahmet");
        tm.put(104,"mehmet");
        System.out.println("tm = " + tm);


        tm.put(101, null);
      //  tm.put(null,"bekir");         RTE verir.

        System.out.println("tm = " + tm);


        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");

        System.out.println("hm = " + hm);

        TreeMap<String,String> tm1=new TreeMap<>(hm); //

        System.out.println("tm1 = " + tm1);

        //  TreeMap<String,String> tm2=hm;      CTE verir



        // map.ceilingKey --> girilen key varsa retunrn eder .
        // yoksa kendisinden küçük  en büyük key i return eder.
        // en küçük abi-abla


        System.out.println("tm.ceilingKey(100) = " + tm.ceilingKey(99));   //101
        System.out.println("tm.ceilingKey(111) = " + tm.ceilingKey(111));   //null
        System.out.println("tm.ceilingKey(102) = " + tm.ceilingKey(102));   //102
        System.out.println("tm.ceilingKey(1) = " + tm.ceilingKey(1));       //101

        // ascending order--> artan sıralama
        // descending order--> azalan sıralama

        System.out.println("tm = " + tm);


        System.out.println("tm.descendingKeySet() = " + tm.descendingKeySet());
        System.out.println("tm.keySet() = " + tm.keySet());
        System.out.println("tm.firstKey() = " + tm.firstKey());
        System.out.println("tm.lastKey() = " + tm.lastKey());



    }
}
