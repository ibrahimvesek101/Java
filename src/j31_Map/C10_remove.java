package j31_Map;

import java.util.HashMap;

public class C10_remove {
    public static void main(String[] args) {

        //  map.remove();--> girilen entry map te var ise siler ve true return eder.yoksa false return

        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");
        System.out.println("hm remove öncesi = " + hm);

        System.out.println("hm.remove(\"Apple\") = " + hm.remove("Apple","450 Euro"));

        System.out.println("hm.remove(\"aaa\") = " + hm.remove("aaa"));
        System.out.println("hm = " + hm);

        System.out.println("hm.remove(\"Media Markt\") = " + hm.remove("Media Markt"));


        System.out.println("hm remove sonrası = " + hm);

    }
}
