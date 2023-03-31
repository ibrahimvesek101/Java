package j31_Map;

import java.util.HashMap;

public class C11_putIfAbsent {
    public static void main(String[] args) {


        // eleman yoksa ekle

        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");

        System.out.println("hm putIfAbsent öncesi = " + hm);

        System.out.println("hm.putIfAbsent(\"Amazon\",\"selametle\") = " + hm.putIfAbsent("Amazon", "selametle"));

        System.out.println("hm.putIfAbsent(\"olmayan key\", \"Yokluk\") = " + hm.putIfAbsent("olmayan key", "Yokluk"));


        System.out.println("hm putIfAbsent sonrası = " + hm);


    }
}
