package j31_Map;

import java.util.HashMap;

public class C08_getOrDefault {
    public static void main(String[] args) {

        // map.getOrDefault(); -> girilen key map'de varsa key'e ait value yoksa default değer return eder
        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");

        System.out.println("hm getOrDefault öncesi  = " + hm);//{Apple=450 Euro, Saturn=200 Euro, Teknosa=333 Euro, Media Markt=444 Euro, Amazon=296 Euro, Vatan=111 Euro}

        System.out.println("hm.getOrDefault(\"Ebay\",\"javAYDIN\") = " + hm.getOrDefault("Apple", "javaSU")); //   450 Euro
        //Apple key map'de oldugu için  Apple key value  450 Euro return edildi
        System.out.println("hm.getOrDefault(\"olmayanKEY\",\"javASLAN\") = " + hm.getOrDefault("olmayanKEY", "javASLAN")); //  javASLAN
        // olmayanKEY map'de olmadıgı için girilem dafultValue javASLAN return edildi
        System.out.println("hm.getOrDefault(\"Vatan\",\"111 Euro\") = " + hm.getOrDefault("Vatan", "111 Euro")); //  111 Euro
        System.out.println("hm getOrDefault sonrası = " + hm); // {Apple=450 Euro, Saturn=200 Euro, Teknosa=333 Euro, Media Markt=444 Euro, Amazon=296 Euro, Vatan=111 Euro}

    }
}