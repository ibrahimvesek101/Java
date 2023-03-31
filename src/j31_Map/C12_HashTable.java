package j31_Map;

import java.util.HashMap;
import java.util.Hashtable;

public class C12_HashTable {
    public static void main(String[] args) {
    /*
    HashTable ->
    HashMap'e kullanılan  tüm methodlar hashTable obj ile de call edilir.
    1- HashMap ve TreeMap thread-safe ve synchronized olmadıgı için Map'lar arasında thread-safe ve synchronize
    olam bir map'e ihityaç oldugundan Hashtable tanımlanmıştır.
    2-HashTable HashMap'e göre daha yavaştır
    3-HashTable key ve value'lerda null değere izin vermez.
    4-HashTable eleman ataması yapılırken  HashMap randum(rastgele: hurra )  yapar.
 */


        Hashtable<String, String> hm = new Hashtable<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");

        System.out.println("hm ilk = " + hm);
        // System.out.println("hm.put(\"samsung\",null) = " + hm.put("samsung", null));     --RTE

        System.out.println("hm.put(\"Apple\",\"5 €\") = " + hm.put("Apple", "5 €"));

       // System.out.println("hm.put(null,\"yokluk\") = " + hm.put(null, "yokluk"));        --RTE

        System.out.println("hm sonra = " + hm);



        Hashtable<String, String> hm1 = new Hashtable<>();//bos hm tanımlandı

        hm1.put("bal", "2 €");
        hm1.put("tarçın", "22 €");
        hm1.put("limon", "12 €");
        hm1.put("kek", "42 €");
        hm1.put("pekmez", "32 €");
        hm1.put("tahin", "42 €");

        hm.putAll(hm1);
        System.out.println("hm son = " + hm);

    }
}
